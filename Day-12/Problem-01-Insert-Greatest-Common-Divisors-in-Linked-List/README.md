# 2807. Insert Greatest Common Divisors in Linked List

## Problem Statement

Given the head of a linked list, insert a new node between every pair of adjacent nodes.

The new node's value should be the Greatest Common Divisor (GCD) of the adjacent nodes.

Return the modified linked list.

## Approach

1. Traverse the linked list.
2. For every adjacent pair:
   - Compute GCD using Euclid's Algorithm.
   - Create a new node containing the GCD.
   - Insert it between the pair.
3. Continue traversal from the next original node.

## Complexity Analysis

- Time Complexity: O(n × log(maxValue))
- Space Complexity: O(1)

## Concepts Used

- Linked List
- Euclidean Algorithm
- GCD
- Pointer Manipulation
