# 7. Reverse Integer

## Problem Statement

Given a signed 32-bit integer `x`, return `x` with its digits reversed. If reversing the integer causes it to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, return `0`.

## Approach

1. Extract the last digit using modulo operation.
2. Remove the last digit from the number.
3. Check for overflow and underflow before updating the reversed number.
4. Build the reversed integer digit by digit.

## Complexity Analysis

- Time Complexity: O(log n)
- Space Complexity: O(1)

## Concepts Used

- Mathematics
- Modulo and Division
- Integer Overflow Handling
