# Middle of the Linked List (LeetCode 876)

## Difficulty

Easy

## Language

Java

## Problem Statement

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

---

## Approach

Use two pointers:

* Slow Pointer → moves one step.
* Fast Pointer → moves two steps.

When the fast pointer reaches the end, the slow pointer will be at the middle node.

This works for both odd and even length linked lists.

---

## Java Solution

```java
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
```

## Complexity Analysis

* Time Complexity: O(n)
* Space Complexity: O(1)

## Concepts Practiced

* Linked Lists
* Fast & Slow Pointers
* Two Pointer Technique
* Traversal
* Space Optimization
