# Merge Two Sorted Lists (LeetCode 21)

## Difficulty

Easy

## Language

Java

## Problem Statement

You are given the heads of two sorted linked lists.

Merge the two lists into one sorted list and return its head.

---

## Approach

Use a dummy node and compare nodes from both lists.

1. Create a dummy node.
2. Compare current nodes of both lists.
3. Attach the smaller node to the merged list.
4. Move the corresponding pointer.
5. Append remaining nodes once one list is exhausted.

---

## Java Solution

```java
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
```

## Complexity Analysis

- Time Complexity: O(n + m)
- Space Complexity: O(1)

## Concepts Practiced

- Linked Lists
- Dummy Nodes
- Two-Pointer Technique
- Merging Sorted Structures
- Traversal
