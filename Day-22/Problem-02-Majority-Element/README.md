# 169. Majority Element

## Problem Statement

Given an integer array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n/2⌋ times.

It is guaranteed that the majority element exists.

---

## Approach

Use the Boyer-Moore Voting Algorithm.

Maintain a candidate and a counter:

- If count becomes 0, choose the current element as the new candidate.
- If the current element equals the candidate, increment count.
- Otherwise, decrement count.

Since the majority element appears more than half the time, it will remain as the final candidate.

---

## Algorithm

1. Initialize candidate and count.
2. Traverse the array.
3. Update candidate when count becomes 0.
4. Increase or decrease count based on matches.
5. Return the final candidate.

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

---

## Concepts Used

- Arrays
- Boyer-Moore Voting Algorithm
- Greedy Approach
- Space Optimization
