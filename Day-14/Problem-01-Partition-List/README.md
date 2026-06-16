# 86. Partition List

## Problem Statement

Given the head of a linked list and an integer `x`, partition it such that all nodes with values less than `x` come before nodes with values greater than or equal to `x`.

The relative order of nodes in each partition should be preserved.

## Approach

1. Create two dummy linked lists:
   - One for nodes with values less than `x`.
   - One for nodes with values greater than or equal to `x`.
2. Traverse the original linked list and attach each node to the appropriate list.
3. Connect the smaller list with the larger list.
4. Return the new head.

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

## Concepts Used

- Linked List
- Dummy Nodes
- Two Pointers
- In-place Manipulation
- Stable Partitioning
