# 1979. Find Greatest Common Divisor of Array

## Problem Statement

Given an integer array `nums`, find the greatest common divisor (GCD) of the smallest and largest elements present in the array.

---

## Approach

The smallest and largest values are first identified by traversing the array. The Euclidean Algorithm is then used to compute their GCD efficiently.

---

## Algorithm

1. Initialize variables to store the minimum and maximum values.
2. Traverse the array and update the minimum and maximum elements.
3. Apply the Euclidean Algorithm:
   - Find the remainder of the larger number divided by the smaller number.
   - Replace the larger number with the smaller number.
   - Replace the smaller number with the remainder.
4. Continue until the remainder becomes zero.
5. Return the remaining non-zero number as the GCD.

---

## Complexity Analysis

- Time Complexity: O(n + log(min(a, b)))
- Space Complexity: O(1)

---

## Concepts Used

- Arrays
- Mathematics
- Euclidean Algorithm
- Minimum and Maximum Search
- Optimization
