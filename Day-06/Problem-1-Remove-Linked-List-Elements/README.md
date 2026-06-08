Problem 1 – Remove Linked List Elements
Problem Link

https://leetcode.com/problems/remove-linked-list-elements/

Difficulty

Easy

Approach

A dummy node is added before the head node to simplify deletion operations, especially when the head itself needs to be removed.

The list is traversed once:

If the next node contains the target value, it is skipped.
Otherwise, move to the next node.
Algorithm
Create a dummy node pointing to head.
Initialize a pointer at the dummy node.
Traverse the linked list.
Remove nodes containing the target value.
Return dummy.next.
Complexity
Time Complexity: O(n)
Space Complexity: O(1)
Java Solution
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
