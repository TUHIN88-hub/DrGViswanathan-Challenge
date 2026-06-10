Problem: 400. Nth Digit

Platform: LeetCode
Difficulty: Medium

Problem Statement

Given an integer n, return the n-th digit in the infinite integer sequence:

1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, ...
Approach
Determine the digit-length block containing the answer.
Compute the exact number where the digit lies.
Extract the required digit using indexing.
Example
n = 11

Sequence:
12345678910...

11th digit = 0
Complexity Analysis
Time Complexity: O(log n)
Space Complexity: O(1)
Concepts Used
Mathematics
Number Theory
Digit Manipulation
Pattern Recognition
