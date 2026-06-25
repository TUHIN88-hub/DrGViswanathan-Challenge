# 32. Longest Valid Parentheses

## Problem Statement

Given a string containing only '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

---

## Approach

This solution uses a stack to store indices instead of characters.

- Initialize the stack with `-1` as the starting index.
- Push the index of every opening parenthesis.
- For every closing parenthesis:
  - Pop the top element.
  - If the stack becomes empty, push the current index.
  - Otherwise, calculate the current valid substring length using:
    currentIndex - stack.peek()
- Keep track of the maximum valid length throughout the traversal.

---

## Algorithm

1. Create a stack and push `-1`.
2. Traverse the string from left to right.
3. Push indices of `'('`.
4. For `')'`, pop the stack.
5. If the stack becomes empty, push the current index.
6. Otherwise, update the maximum valid substring length.
7. Return the maximum length.

---

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

## Concepts Used

- Stack
- String Traversal
- Index Tracking
- Linear Scan
