# 35. Search Insert Position

## Problem Statement

Given a sorted array of distinct integers and a target value, return the index if the target is found. Otherwise, return the index where it should be inserted to maintain the sorted order.

---

## Approach

Since the array is sorted, Binary Search is the optimal solution.

- Initialize two pointers: `left` and `right`.
- Compute the middle index.
- If the middle element equals the target, return its index.
- If the target is greater, search the right half.
- Otherwise, search the left half.
- If the target is not found, the `left` pointer indicates the correct insertion position.

---

## Algorithm

1. Initialize `left = 0` and `right = n - 1`.
2. Perform Binary Search.
3. Return the index if found.
4. Otherwise, return `left`.

---

## Complexity Analysis

- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

## Concepts Used

- Binary Search
- Divide and Conquer
- Arrays
- Searching Algorithms
