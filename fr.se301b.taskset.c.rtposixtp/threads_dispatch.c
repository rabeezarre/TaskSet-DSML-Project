#include "threads_dispatch.h"

#ifdef DEBUG
#include <stdio.h>
#endif

#include <stdint.h>

#define ONE_SEC 1000000000

uint64_t start_time; // start_time in nanoseconds

int create_fp_thread(	unsigned int priority,
						unsigned int stack_size,
						void* (*start_routine)(void),
						pthread_t *tid,
						int policy) {
	int sys_ret;
	pthread_attr_t attr;
	struct sched_param param;

	sys_ret = pthread_attr_init(&attr);
	if (sys_ret != 0) {
		perror("Error initializing thread attr");

		return sys_ret;
	}

	pthread_attr_setinheritsched(&attr, PTHREAD_EXPLICIT_SCHED);

	sys_ret = pthread_attr_setscope(&attr, PTHREAD_SCOPE_SYSTEM);
	if (sys_ret != E_OK) {
		perror("Error setting scope of thread");

		return sys_ret;
	}

	if (stack_size != E_OK) {
		// On some systems, pthread_attr_setstacksize() can fail with the error
		// EINVAL if stacksize is not a multiple of the system page size.
		sys_ret = pthread_attr_setstacksize(&attr, stack_size);

		if (sys_ret != E_OK) {
			perror("Error setting set stack size of thread");

			return sys_ret;
		}
	}

	sys_ret = pthread_attr_setschedpolicy(&attr, policy);

	if (sys_ret != E_OK) {
		perror("Error setting scheduling policy of thread");

		return sys_ret;
	}

	param.sched_priority = priority;
	sys_ret = pthread_attr_setschedparam(&attr, &param);

	if (sys_ret != E_OK) {
		perror("Error setting scheduling priority");

		return sys_ret;
	}

	printf("Creating thread\n");
	sys_ret = pthread_create(tid, &attr, (void* (*)(void*)) start_routine, NULL);

	if (sys_ret != E_OK) {
		perror("Error launching thread");
	}

	return sys_ret;
}

int init_sporadic_config(thread_config_t *config) {
	sporadic_thread_config_t info = config->sporadic_config;
	int ret = pthread_mutex_init(info.global_q->rez, NULL);
	ret = pthread_cond_init(info.global_q->event, NULL);
	return ret;
}

int init_periodic_config(thread_config_t *config) {
	periodic_thread_config_t info = config->periodic_config;
	int ret = E_OK;

	return ret;
}

StatusType await_periodic_dispatch(thread_config_t *config) {
	periodic_thread_config_t *info = &config->periodic_config;

	info->iteration_counter++;
	uint64_t next = start_time
			+ info->iteration_counter * info->period * 1000000;

	struct timespec periodic_timespec;
	periodic_timespec.tv_sec = next / ONE_SEC;
	periodic_timespec.tv_nsec = next % ONE_SEC;

//	clock_nanosleep(CLOCK_MONOTONIC, TIMER_ABSTIME, &periodic_timespec, NULL);
	nanosleep(&periodic_timespec, NULL);

	return E_OK;
}

StatusType await_sporadic_dispatch(thread_queue_t *global_q) {
	thread_config_t *config = global_q->task;
	sporadic_thread_config_t *info = &config->sporadic_config;

	StatusType status = E_OK;

	// wait next period
	if (info->timing_wait_phase) {
//		clock_nanosleep(CLOCK_MONOTONIC, TIMER_ABSTIME, info->sporadic_timespec,
//				NULL);
		nanosleep(info->sporadic_timespec, NULL);
	}

	info->timing_wait_phase = 1;

	// wait for messages
	status = pthread_mutex_lock(info->global_q->rez);

	if (status != E_OK) {
		return status;
	}

	if (info->global_q->msg_nb == 0) {
		info->global_q->waiting = info->global_q->waiting + 1;
		pthread_cond_wait(info->global_q->event, info->global_q->rez);
		info->global_q->waiting = info->global_q->waiting - 1;
	}

	struct timespec now_timespec;
	clock_gettime(CLOCK_MONOTONIC, &now_timespec);
	uint64_t now = now_timespec.tv_sec * ONE_SEC + now_timespec.tv_nsec;
	uint64_t delay = ((uint64_t) info->time_interval) * 1000000;
	uint64_t next = now + delay;
	info->sporadic_timespec->tv_sec = next / ONE_SEC;
	info->sporadic_timespec->tv_nsec = next % ONE_SEC;

	pthread_mutex_unlock(info->global_q->rez);

	return status;
}

void set_start_time() {
	struct timespec start_timespec;
	clock_gettime(CLOCK_MONOTONIC, &start_timespec);
	start_time = start_timespec.tv_sec * ONE_SEC + start_timespec.tv_nsec;
}

void display_relative_date(char *id, unsigned long iteration) {
	struct timespec current_timespec;

#ifdef DEBUG
  clock_gettime(CLOCK_MONOTONIC, &current_timespec);
  uint64_t now = current_timespec.tv_sec * ONE_SEC + current_timespec.tv_nsec;
  now = now - start_time;
  printf("%s - date: %lld sec: %lld nsec - iteration %ld\n", id, now/ONE_SEC, now%ONE_SEC, iteration);
#endif
}

void simulate_exec_time(unsigned int exec_time_ns) {
	unsigned int start_time_ns = get_time_ns();
	char reached = 0;

	while (!reached) {
		unsigned int current_time_ns = get_time_ns();
		if (current_time_ns - start_time_ns > exec_time_ns)
			reached = 1;
	}
}

unsigned int get_time_ns() {
	struct timespec current_time;
	clock_gettime(CLOCK_MONOTONIC, &current_time);

	unsigned int current_time_ns = (current_time.tv_sec * 1000000000)
			+ current_time.tv_nsec;
	return current_time_ns;
}
