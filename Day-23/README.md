# Day 23 - Dr. G. Viswanathan Coding Challenge

## Overview

Day 23 focused on mastering **Stack** and **Binary Search** techniques. The problems required efficient handling of parentheses matching and optimized searching in sorted arrays while maintaining the required time complexities.

---

## Problem 1: Longest Valid Parentheses

### Problem Statement
Given a string containing only '(' and ')', determine the length of the longest valid (well-formed) parentheses substring.

### Approach
- Used a stack to store indices instead of characters.
- Initialized the stack with `-1` to handle edge cases.
- For every opening parenthesis, pushed its index onto the stack.
- For every closing parenthesis:
  - Popped the top index.
  - If the stack became empty, pushed the current index as the new base.
  - Otherwise, calculated the current valid substring length and updated the maximum length.

### Key Concepts
- Stack
- String Processing
- Index Tracking
- Linear Traversal

### Complexity Analysis
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

### Learning Outcome
Learned how index-based stack operations efficiently solve parentheses matching problems and help compute the longest valid substring.

---

## Problem 2: Search Insert Position

### Problem Statement
Given a sorted array of distinct integers and a target value, return its index if found; otherwise, return the position where it should be inserted while maintaining sorted order.

### Approach
- Applied Binary Search to locate the target efficiently.
- If found, returned its index.
- Otherwise, returned the `left` pointer after the search, which represents the correct insertion position.

### Key Concepts
- Binary Search
- Divide and Conquer
- Searching Algorithms

### Complexity Analysis
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

### Learning Outcome
Strengthened understanding of Binary Search and how it can efficiently solve search and insertion problems in sorted arrays.

---

## Skills Practiced

- Stack Data Structure
- Binary Search
- String Manipulation
- Array Traversal
- Index-Based Computation
- Divide and Conquer
- Time Complexity Optimization

---

## Day 23 Summary

| Problem | Topic | Difficulty |
|---------|-------|------------|
| Longest Valid Parentheses | Stack, String | Hard |
| Search Insert Position | Binary Search | Easy |

### Day Statistics
- Problems Solved: **2**
- Easy: **1**
- Medium: **0**
- Hard: **1**

### Progress Tracker
✅ Day 23 Completed

### Key Takeaway
Day 23 reinforced two essential interview topics: **Stack** for handling matching parentheses and **Binary Search** for efficient searching in sorted arrays. Both solutions demonstrated how selecting the right data structure and algorithm significantly improves performance and code efficiency.
