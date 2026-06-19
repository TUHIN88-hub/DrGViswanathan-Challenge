# 155. Min Stack

## Problem Statement
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the `MinStack` class:
- `MinStack()` initializes the stack.
- `push(int val)` inserts an element.
- `pop()` removes the top element.
- `top()` returns the top element.
- `getMin()` returns the minimum element.

All operations should work in O(1) time.

---

## Approach

Maintain two stacks:
1. **Main Stack** – Stores all elements.
2. **Minimum Stack** – Stores the current minimum elements.

Whenever a new value is smaller than or equal to the current minimum, it is pushed into the minimum stack. During removal, if the popped value matches the current minimum, it is also removed from the minimum stack.

---

## Algorithm

1. Initialize two stacks.
2. For `push`:
   - Push the element into the main stack.
   - Update the minimum stack if needed.
3. For `pop`:
   - Remove the top element.
   - Remove it from the minimum stack if it is the current minimum.
4. `top()` returns the top element.
5. `getMin()` returns the minimum value.

---

## Complexity Analysis

- Time Complexity:
  - Push: O(1)
  - Pop: O(1)
  - Top: O(1)
  - GetMin: O(1)

- Space Complexity:
  - O(n)

---

## Concepts Used

- Stack
- Auxiliary Stack
- Object-Oriented Programming
- Data Structure Optimization
