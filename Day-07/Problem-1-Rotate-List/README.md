Problem 1 – Rotate List
Problem Link

https://leetcode.com/problems/rotate-list/

Difficulty

Medium

Approach

Instead of rotating the list one step at a time:

Find the length of the list.
Connect the tail to the head, forming a circular list.
Compute effective rotations using k % length.
Find the new tail at position length - k - 1.
Set the next node as the new head.
Break the circular connection.
Algorithm
Handle edge cases.
Find length and tail.
Calculate k %= length.
Form a circular linked list.
Move to the new tail.
Update pointers.
Return the new head.
Complexity
Time Complexity: O(n)
Space Complexity: O(1)
Solution
class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if (!head || !head->next || k == 0)
            return head;

        int length = 1;
        ListNode* tail = head;

        while (tail->next) {
            tail = tail->next;
            length++;
        }

        k %= length;
        if (k == 0)
            return head;

        tail->next = head;

        int stepsToNewTail = length - k - 1;
        ListNode* newTail = head;

        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail->next;
        }

        ListNode* newHead = newTail->next;
        newTail->next = nullptr;

        return newHead;
    }
};
