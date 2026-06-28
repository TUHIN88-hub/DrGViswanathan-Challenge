# Problem 01 - Implement Stack Using Queues

## Problem Link
https://leetcode.com/problems/implement-stack-using-queues/

## Difficulty
Easy

## Concepts Used
- Queue
- Stack
- Simulation
- Data Structure Design
- OOP

## Approach

Maintain two queues.

- During `push()`, insert the new element into the second queue.
- Move all elements from the first queue to the second queue.
- Swap the two queues.
- This ensures the newest element always remains at the front.
- Therefore, `pop()` and `top()` become O(1).

## Time Complexity

- Push: O(n)
- Pop: O(1)
- Top: O(1)
- Empty: O(1)

## Space Complexity

O(n)
