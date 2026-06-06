# Palindrome Linked List (LeetCode 234)

## Difficulty

Easy

## Language

Java

## Problem Statement

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

---

## Approach

1. Find the middle of the linked list using slow and fast pointers.
2. Reverse the second half of the linked list.
3. Compare both halves node by node.
4. If all nodes match, return true.

---

## Java Solution

```java
class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;

        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode left = head;
        ListNode right = prev;

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }
}
```

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

## Concepts Practiced

- Linked Lists
- Fast & Slow Pointers
- In-place Reversal
- Space Optimization
