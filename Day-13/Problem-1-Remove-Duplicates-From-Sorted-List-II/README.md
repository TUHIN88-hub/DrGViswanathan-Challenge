# Remove Duplicates from Sorted List II

## Problem Statement

Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

## Approach

1. Create a dummy node before the head.
2. Traverse the list using two pointers.
3. Detect duplicate sequences.
4. Skip all nodes with duplicate values.
5. Connect unique nodes together.

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

## Concepts Used

- Linked Lists
- Two Pointers
- Dummy Node
- In-place Deletion
