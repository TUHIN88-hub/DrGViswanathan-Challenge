# 232. Implement Queue using Stacks

## Problem Statement

Implement a First In First Out (FIFO) queue using only two stacks.

Implement the following operations:

- push(x): Push element x to the back of queue.
- pop(): Remove the element from the front of queue and return it.
- peek(): Get the front element.
- empty(): Return whether the queue is empty.

Only standard stack operations are allowed.

---

## Approach

Use two stacks:

1. Input Stack
   - Stores newly inserted elements.

2. Output Stack
   - Stores elements in queue order.

Whenever the output stack becomes empty and a pop/peek operation is requested, transfer all elements from the input stack to the output stack.

This reversal ensures FIFO behavior.

---

## Algorithm

1. Initialize two stacks.
2. For push:
   - Insert element into input stack.
3. For peek/pop:
   - If output stack is empty, transfer all elements from input stack.
   - Perform the required operation on output stack.
4. For empty:
   - Check whether both stacks are empty.

---

## Complexity Analysis

- Push: O(1)
- Pop: O(1) amortized
- Peek: O(1) amortized
- Empty: O(1)

Space Complexity: O(n)

---

## Concepts Used

- Stack
- Queue
- Data Structure Design
- Amortized Analysis
- Object-Oriented Programming
