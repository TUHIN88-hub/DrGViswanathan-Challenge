# 1. Two Sum

## Problem Statement

Given an integer array `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

You may assume that each input has exactly one solution, and the same element cannot be used twice.

The answer can be returned in any order.

---

## Approach

Use a HashMap to store the value and its index while traversing the array.

For each element:
- Calculate the required complement as `target - current element`.
- Check if the complement already exists in the HashMap.
- If it exists, return the indices.
- Otherwise, store the current element and its index.

This allows us to find the solution in a single traversal.

---

## Algorithm

1. Create an empty HashMap.
2. Traverse the array from left to right.
3. Calculate the complement for the current number.
4. If the complement exists in the HashMap, return the stored index and current index.
5. Otherwise, store the current number with its index.
6. Continue until the pair is found.

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(n)

---

## Concepts Used

- Arrays
- HashMap
- Hashing
- One-pass traversal
- Optimized searching
