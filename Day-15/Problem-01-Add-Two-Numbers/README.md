# 2. Add Two Numbers

## Problem Statement

Given two non-empty linked lists representing two non-negative integers in reverse order, add the two numbers and return the sum as a linked list.

Each node contains a single digit, and the result should also be returned in reverse order.

## Approach

1. Create a dummy node to store the result.
2. Traverse both linked lists simultaneously.
3. Add the digits along with the carry.
4. Create a new node for the current digit.
5. Move to the next nodes until all digits and carry are processed.

## Complexity Analysis

- Time Complexity: O(max(n, m))
- Space Complexity: O(max(n, m))

## Concepts Used

- Linked List
- Dummy Node
- Carry Handling
- Simulation
