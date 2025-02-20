# TaskSet DSML - Simulating Communicating Tasks

## Overview
This project is about simulating and generating C code for a set of communicating tasks in a real-time system. Instead of manually writing complex C code for task scheduling and communication, we use a modeling approach that makes it easier to design and test task-based applications.

## What This Project Simulates
- A set of tasks that run either periodically (at fixed time intervals) or sporadically (with random delays).
- Tasks communicate with each other using input and output ports.
- Messages are passed between tasks using queues.
- The system runs using Rate Monotonic Scheduling (RMS), a fixed-priority scheduling method used in real-time systems.
- The final C code generated can be compiled and run on a system that supports RT-POSIX threading.

## Repository Structure
- **fr.se301b.taskset.c.rtposixtp** → Contains generated C code that simulates task execution.
- **fr.se301b.taskset.generator.c** → The code generator that converts task models into C code.
- **fr.se301b.taskset.model.rtposixtp** → Task set models describing task behaviors and communication.
- **fr.se301b.taskset** → The core definitions of tasks, ports, and connections.

## How It Works
1. **Create a Task Model**: Define tasks, their types (periodic/sporadic), and their communication links.
2. **Validate the Model**: Ensure that task names are unique and connections are correctly set up.
3. **Generate C Code**: Use Acceleo to automatically generate C code based on the task model.
4. **Compile and Run**: Build the generated C program and execute it to simulate real-time task execution.

## Why Use This?
- Simplifies writing complex real-time multi-threaded applications.
- Reduces errors by automating code generation.
- Allows easy modifications without rewriting the entire program.
- Helps understand how real-time task scheduling and communication work.

## Requirements
- Eclipse with Modeling Tools
- Acceleo (for code generation)
- Eclipse CDT (for compiling and running the C code)
- Linux with RT-POSIX support (for actual execution)
