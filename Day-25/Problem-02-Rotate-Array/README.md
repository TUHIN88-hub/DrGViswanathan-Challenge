# Problem 02 - Rotate Array

## Problem Link
https://leetcode.com/problems/rotate-array/

## Difficulty
Medium

## Concepts Used
- Arrays
- Two Pointers
- In-place Algorithm
- Array Reversal

## Approach

Instead of shifting the array one position at a time, use the reversal algorithm:

1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining `n-k` elements.

This rotates the array in-place with constant extra space.

## Time Complexity

O(n)

## Space Complexity

O(1)
