# 150. Evaluate Reverse Polish Notation

## Problem Statement

Given an array of strings representing an arithmetic expression in Reverse Polish Notation, evaluate the expression and return the integer result.

Valid operators are `+`, `-`, `*`, and `/`. Division between two integers truncates toward zero.

---

## Approach

Use a stack to evaluate the postfix expression.

- Traverse every token in the array.
- If the token is a number, push it onto the stack.
- If the token is an operator, pop two operands from the stack.
- Perform the operation in the correct order and push the result back.
- The last remaining element in the stack is the final answer.

---

## Algorithm

1. Create an empty stack.
2. Traverse all tokens.
3. Push numbers into the stack.
4. For operators, pop two values and perform the required operation.
5. Push the result back into the stack.
6. Return the remaining value from the stack.

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(n)

---

## Concepts Used

- Stack
- Reverse Polish Notation
- Postfix Expression Evaluation
- Arithmetic Operations
- String Processing
