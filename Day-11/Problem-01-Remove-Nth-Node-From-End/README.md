# 19. Remove Nth Node From End of List

## Problem Statement

Given the head of a linked list, remove the nth node from the end and return the modified list.

## Approach

Use two pointers:

1. Create a dummy node before the head.
2. Move the fast pointer n+1 steps ahead.
3. Move both fast and slow pointers simultaneously.
4. When fast reaches the end, slow will be just before the node to be removed.
5. Update the links to skip the target node.

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

## Concepts Used

- Linked List
- Two Pointers
- Fast & Slow Pointer
- Dummy Node
