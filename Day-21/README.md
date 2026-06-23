# Day 21 - Dr. G. Viswanathan Coding Challenge

## Overview

Day 21 of the Dr. G. Viswanathan Coding Challenge focused on strengthening concepts related to **Greedy Algorithms, Mathematics, Combinatorics, and String Validation**.

The problems solved today involved validating parenthesis strings containing wildcard characters and generating a specific row of Pascal's Triangle using mathematical optimization.

---

## Problems Solved

### Problem 1: Valid Parenthesis String
- **Platform:** LeetCode
- **Difficulty:** Medium

#### Concepts Covered:
- Greedy Algorithm
- String Processing
- Parentheses Matching
- Range Tracking

#### Approach:
A greedy strategy was used by maintaining two variables:

- `low` = minimum possible open parentheses count
- `high` = maximum possible open parentheses count

The wildcard `'*'` can act as `'('`, `')'`, or an empty string. By tracking the possible range of open brackets throughout the traversal, it becomes possible to determine whether a valid interpretation exists without exploring every possibility.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### Problem 2: Pascal's Triangle II
- **Platform:** LeetCode
- **Difficulty:** Easy

#### Concepts Covered:
- Mathematics
- Pascal's Triangle
- Combinatorics
- Arrays

#### Approach:
Instead of generating the complete Pascal's Triangle, the required row was generated directly using the binomial coefficient relationship:

`C(n,r) = C(n,r-1) × (n-r+1) / r`

This approach efficiently computes every element of the required row in a single traversal.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

## Key Learnings

- Learned how greedy techniques can efficiently solve complex validation problems.
- Improved understanding of handling wildcard characters in string-based questions.
- Practiced combinatorial mathematics and binomial coefficient calculations.
- Strengthened problem-solving skills by avoiding unnecessary computations.
- Explored optimized approaches that reduce both time and space complexity.

---

## Progress Summary

- Total Problems Solved: 2
- Platform Used: LeetCode
- Programming Language: Java

---

### Problems Completed

1. 678. Valid Parenthesis String
2. 119. Pascal's Triangle II

---

### Keep Coding, Keep Learning! 🚀
