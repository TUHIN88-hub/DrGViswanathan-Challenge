# Problem 02 - Find First and Last Position of Element in Sorted Array

## Problem Link
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

## Difficulty
Medium

## Language
Java

## Concepts Used
- Binary Search
- Arrays
- Divide and Conquer

## Approach

- Perform two binary searches.
- The first binary search finds the leftmost occurrence of the target.
- The second binary search finds the rightmost occurrence.
- Return both indices as the final answer.
- If the target does not exist, return `[-1, -1]`.

## Time Complexity

O(log n)

## Space Complexity

O(1)
