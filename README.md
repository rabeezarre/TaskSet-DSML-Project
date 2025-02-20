# TaskSet DSML - Simulating Communicating Tasks

## Overview
This project simulates and generates C code for real-time communicating tasks. It simplifies task scheduling and message passing using a model-driven approach.

## Simulation Features
- Tasks run **periodically** (fixed intervals) or **sporadically** (random delays).
- Communication through **input/output ports** and **FIFO queues**.
- Uses **Rate Monotonic Scheduling (RMS)**.
- Generates **RT-POSIX-compliant C code**.

## Project Creation
1. **Metamodel Development**
   - Built using **Ecore (Eclipse Modeling Framework)**.
   - Defines **tasks, ports, connections, and scheduling policies**.
2. **Validation Rules**
   - Unique task names: each task must have a distinct name.
   - Valid port connections: ports must match in data type and have correct input/output directions.
   - FIFO queue size limits: connections must define a max queue size for message passing.
   - Connection validity: no multiple inputs from different sources to the same input port.
   - and more...
3. **Code Generation**
   - Uses **Acceleo** for model-to-text transformation.
   - Produces **C functions for tasks, message passing, and synchronization**.
4. **Compilation & Execution**
   - Uses **Eclipse CDT** for C compilation.
   - Runs on **Linux with RT-POSIX threading**.

## Repository Structure
- **fr.se301b.taskset.c.rtposixtp** → Generated C code.
- **fr.se301b.taskset.generator.c** → Acceleo code generator.
- **fr.se301b.taskset.model.rtposixtp** → Task models.
- **fr.se301b.taskset** → Core definitions.

## How It Works
1. **Create a Task Model** (define tasks, timing, connections).
2. **Validate** (check constraints and scheduling rules).
3. **Generate C Code** (automatic model-to-text conversion).
4. **Compile & Run** (test the generated task set in RT-POSIX).

## Why Use This?
- Automates **error-prone** multi-threaded programming.
- Makes **modifications easy** without rewriting C code.

## Requirements
- **Eclipse Modeling Tools**
- **Acceleo** (for code generation)
- **Eclipse CDT** (for compiling C code)
- **Linux with RT-POSIX support**
