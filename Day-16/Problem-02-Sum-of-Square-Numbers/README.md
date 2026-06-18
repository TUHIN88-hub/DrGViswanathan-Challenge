Problem 2: Sum of Square Numbers (LeetCode 633)
Problem Statement:

Given a non-negative integer c, determine whether there exist two integers a and b such that:

a² + b² = c

Return true if such a pair exists, otherwise return false.

Approach:
Use two pointers starting from 0 and √c.
Calculate the sum of their squares.
Move the pointers based on whether the sum is greater or smaller than c.
This efficiently finds a valid pair without checking every combination.
Complexity:
Time Complexity: O(√c)
Space Complexity: O(1)
Concepts Used:
Two Pointer Technique
Mathematics
Square Root Optimization
