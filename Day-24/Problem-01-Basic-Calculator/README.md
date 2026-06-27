# Problem 1: Basic Calculator

## 🔹 Problem Statement
Given a string representing a valid arithmetic expression, evaluate it and return its result without using any built-in evaluation functions.

---

## 🔹 Approach
- Traverse the expression character by character.
- Form multi-digit numbers whenever consecutive digits are encountered.
- Keep track of the current result and sign.
- Use a stack to store the previous result and sign before entering parentheses.
- When a closing parenthesis is found, evaluate the current expression and merge it with the previous context.

---

## 🔹 Algorithm
1. Initialize `result`, `number`, and `sign`.
2. Traverse each character of the string.
3. Build numbers from consecutive digits.
4. Update the result whenever '+' or '-' is encountered.
5. Push current result and sign onto the stack when '(' is found.
6. Evaluate the enclosed expression when ')' is encountered.
7. Return the final result.

---

## 🔹 Time Complexity
**O(n)**

## 🔹 Space Complexity
**O(n)**

---

## 🔹 Concepts Used
- Stack
- String Parsing
- Expression Evaluation
- Parentheses Handling
