# 20. Valid Parentheses

## Problem Statement

Given a string containing only the characters '(', ')', '{', '}', '[' and ']', determine whether the given string is valid.

A string is valid if:
- Every opening bracket has a corresponding closing bracket.
- The brackets are of the same type.
- The brackets are closed in the correct order.

---

## Approach

A stack is used to keep track of opening brackets.

- Traverse the string character by character.
- Push opening brackets onto the stack.
- When a closing bracket is encountered, compare it with the top element of the stack.
- If they do not match or the stack is empty, the string is invalid.
- After processing all characters, the stack must be empty for the string to be valid.

---

## Algorithm

1. Create an empty stack.
2. Traverse the string.
3. Push opening brackets into the stack.
4. For closing brackets, check for a matching opening bracket.
5. Return true if the stack is empty after traversal, otherwise return false.

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(n)

---

## Concepts Used

- Stack
- String Traversal
- LIFO Principle
- Character Matching
- Data Structure Design
