# 217. Contains Duplicate

## Problem Statement

Given an integer array `nums`, determine whether any value appears at least twice in the array. Return `true` if any duplicate element exists, otherwise return `false`.

---

## Approach

Use a HashSet to keep track of the elements already seen while traversing the array.

- If the current element already exists in the HashSet, a duplicate is found.
- Otherwise, insert the element into the HashSet and continue checking.

This provides an efficient solution compared to checking every pair of elements.

---

## Algorithm

1. Create an empty HashSet.
2. Traverse every element of the array.
3. If the element is already present in the set, return `true`.
4. Otherwise, add the element to the set.
5. If the entire array is traversed without finding duplicates, return `false`.

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(n)

---

## Concepts Used

- Arrays
- Hashing
- HashSet
- Searching
- Data Structure Optimization
