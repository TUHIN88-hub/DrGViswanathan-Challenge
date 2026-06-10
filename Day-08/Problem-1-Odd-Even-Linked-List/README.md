# Odd Even Linked List

## Problem

Given the head of a singly linked list, group all nodes with odd indices together followed by nodes with even indices.

The relative order within odd and even groups must remain unchanged.

## Approach

1. Maintain two pointers:

   * odd
   * even

2. Store the head of the even list.

3. Traverse the list:

   * Connect odd nodes together.
   * Connect even nodes together.

4. Append the even list after the odd list.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Concepts Used

* Linked Lists
* Pointer Manipulation
* In-Place Rearrangement
