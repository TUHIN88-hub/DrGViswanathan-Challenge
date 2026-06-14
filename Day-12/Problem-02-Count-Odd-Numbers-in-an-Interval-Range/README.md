# 1523. Count Odd Numbers in an Interval Range

## Problem Statement

Given two non-negative integers low and high, return the count of odd numbers between low and high (inclusive).

## Approach

The number of odd numbers from 0 to x is:

(x + 1) / 2

Therefore:

Count = (high + 1) / 2 - low / 2

This allows us to find the answer in constant time.

## Complexity Analysis

- Time Complexity: O(1)
- Space Complexity: O(1)

## Concepts Used

- Mathematics
- Number Theory
- Constant-Time Computation
