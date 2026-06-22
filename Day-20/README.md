# Day 20 - Dr. G. Viswanathan Coding Challenge

## Overview

Day 20 of the Dr. G. Viswanathan Coding Challenge focused on strengthening concepts related to **Stacks, Arrays, Mathematics, and Expression Evaluation**.

The problems solved today involved evaluating postfix expressions using stacks and finding the Greatest Common Divisor (GCD) using efficient mathematical techniques.

---

## Problems Solved

### Problem 1: Evaluate Reverse Polish Notation
- **Platform:** LeetCode
- **Difficulty:** Medium

#### Concepts Covered:
- Stack Data Structure
- Reverse Polish Notation (Postfix Expression)
- Arithmetic Operations
- Expression Evaluation

#### Approach:
A stack was used to process the expression. Numbers were pushed into the stack, and whenever an operator was encountered, two operands were popped, the operation was performed, and the result was pushed back. The final element remaining in the stack represented the answer.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### Problem 2: Find Greatest Common Divisor of Array
- **Platform:** LeetCode
- **Difficulty:** Easy

#### Concepts Covered:
- Arrays
- Minimum and Maximum Search
- Mathematics
- Euclidean Algorithm

#### Approach:
The array was traversed to determine the smallest and largest elements. The Euclidean Algorithm was then applied to calculate the GCD of these two values efficiently.

**Time Complexity:** O(n + log(min(a, b)))  
**Space Complexity:** O(1)

---

## Key Learnings

- Improved understanding of stack-based problem-solving.
- Learned how postfix expressions can be evaluated efficiently.
- Practiced mathematical optimization using the Euclidean Algorithm.
- Strengthened array traversal and searching techniques.
- Enhanced ability to select appropriate data structures and algorithms.

---

## Progress Summary

- Total Problems Solved: 2
- Platforms Used: LeetCode
- Programming Language: Java

---

### Keep Coding, Keep Learning! 🚀
