# 2095. Delete the Middle Node of a Linked List

## Problem Statement

Given the head of a linked list, delete the middle node and return the modified list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node (0-indexed).

## Approach

Use the Slow and Fast Pointer technique:

1. Move `slow` by one step.
2. Move `fast` by two steps.
3. Maintain a `prev` pointer before `slow`.
4. When `fast` reaches the end, `slow` is at the middle node.
5. Delete the middle node using:

```java
prev.next = slow.next;
