# 119. Pascal's Triangle II

## Problem Statement

Given an integer `rowIndex`, return the rowIndex-th (0-indexed) row of Pascal's Triangle.

In Pascal's Triangle, each number is the sum of the two numbers directly above it.

---

## Approach

Instead of generating the entire triangle, directly compute each element of the required row using the binomial coefficient relationship.

Each element is derived from the previous element:

C(n,r) = C(n,r-1) × (n-r+1) / r

This allows generating the row efficiently in one pass.

---

## Algorithm

1. Initialize the first value as 1.
2. Add the current value to the answer list.
3. Compute the next value using the combinatorial formula.
4. Repeat until all elements of the row are generated.
5. Return the resulting list.

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(n)

---

## Concepts Used

- Arrays
- Mathematics
- Pascal's Triangle
- Binomial Coefficients
- Combinatorics
