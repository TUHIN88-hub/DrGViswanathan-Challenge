# Sign of the Product of an Array

## Problem Statement

Given an integer array, determine whether the product of all elements is positive, negative, or zero.

Return:
- 1 if product > 0
- -1 if product < 0
- 0 if product == 0

## Approach

Instead of calculating the actual product:

1. If any element is 0, return 0.
2. Count negative numbers.
3. If negatives count is even, return 1.
4. Otherwise return -1.

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

## Concepts Used

- Arrays
- Mathematics
- Sign Tracking
- Optimization
