# Day 22 - Dr. G. Viswanathan Coding Challenge

## Overview

Day 22 focused on strengthening problem-solving skills through stack-based string processing and voting algorithms. The problems emphasized efficient use of data structures and optimization techniques to achieve the best possible time complexity.

---

## Problem 1: Minimum Remove to Make Valid Parentheses

### Problem Statement
Given a string containing lowercase English letters and parentheses, remove the minimum number of invalid parentheses to make the resulting string valid.

### Approach
- Use a stack to track indices of unmatched opening parentheses.
- Mark invalid closing parentheses during traversal.
- After processing the string, mark any remaining unmatched opening parentheses.
- Build the final valid string by skipping all marked indices.

### Key Concepts
- Stack
- String Manipulation
- Greedy Processing

### Complexity Analysis
- Time Complexity: O(n)
- Space Complexity: O(n)

### Learning Outcome
Learned how stacks can efficiently handle matching parentheses and help identify invalid characters for removal.

---

## Problem 2: Majority Element

### Problem Statement
Find the element that appears more than ⌊n/2⌋ times in an array.

### Approach
- Use the Boyer-Moore Voting Algorithm.
- Maintain a candidate and a counter.
- Increase count when the current element matches the candidate; otherwise decrease it.
- The final candidate is the majority element.

### Key Concepts
- Boyer-Moore Voting Algorithm
- Arrays
- Greedy Logic

### Complexity Analysis
- Time Complexity: O(n)
- Space Complexity: O(1)

### Learning Outcome
Understood how a majority element can be identified in linear time with constant extra space.

---

## Skills Practiced

- Stack Data Structure
- String Processing
- Array Traversal
- Greedy Algorithms
- Space Optimization
- Efficient Problem Solving

---

## Day 22 Summary

| Problem | Topic | Difficulty |
|----------|--------|------------|
| Minimum Remove to Make Valid Parentheses | Stack, String | Medium |
| Majority Element | Boyer-Moore, Arrays | Easy |

### Day Statistics
- Problems Solved: 2
- Easy: 1
- Medium: 1
- Hard: 0

### Progress Tracker
✅ Day 22 Completed

### Key Takeaway
Day 22 highlighted how powerful simple data structures and optimized algorithms can be. The stack-based solution efficiently handled invalid parentheses, while the Boyer-Moore Voting Algorithm demonstrated how majority detection can be achieved with O(1) space.
