Problem 1: Delete Node in a Linked List (LeetCode 237)
Problem Statement:

Given only a node in a singly linked list (without access to the head), delete the given node from the linked list.

Approach:
Since the previous node cannot be accessed, directly removing the node is impossible.
Copy the value of the next node into the current node.
Change the current node’s next pointer to skip the next node.
This makes the current node behave as if it was deleted.
Complexity:
Time Complexity: O(1)
Space Complexity: O(1)
Concepts Used:
Linked List
Pointer Manipulation
In-place Modification
