# Linked List Cycle (LeetCode 141)

## Difficulty

Easy

## Language

Java

## Problem Statement

Given the head of a linked list, determine if the linked list has a cycle in it.

Return true if there is a cycle, otherwise return false.

---

## Approach

Use Floyd's Cycle Detection Algorithm.

1. Initialize two pointers:
   - Slow moves one step.
   - Fast moves two steps.
2. If they meet, a cycle exists.
3. If fast reaches null, no cycle exists.

---

## Java Solution

```java
class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
```

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

## Concepts Practiced

- Linked Lists
- Fast and Slow Pointers
- Floyd Cycle Detection
- Space Optimization
