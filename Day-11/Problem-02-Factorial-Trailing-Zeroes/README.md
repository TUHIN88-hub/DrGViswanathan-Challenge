# 172. Factorial Trailing Zeroes

## Problem Statement

Given an integer n, return the number of trailing zeroes in n!.

## Approach

A trailing zero is produced by a factor of 10.

10 = 2 × 5

Since factorials contain more factors of 2 than 5, we only count the number of factors of 5.

Count:

n/5 + n/25 + n/125 + ...

until n becomes 0.

## Complexity Analysis

- Time Complexity: O(log₅ n)
- Space Complexity: O(1)

## Concepts Used

- Mathematics
- Prime Factorization
- Counting Factors
