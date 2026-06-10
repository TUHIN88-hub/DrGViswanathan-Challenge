Problem: 1721. Swapping Nodes in a Linked List

Platform: LeetCode
Difficulty: Medium

Problem Statement

Given the head of a linked list and an integer k, swap the values of the k-th node from the beginning and the k-th node from the end.

Approach
Traverse to the k-th node from the beginning.
Keep a pointer at the head.
Move both pointers until the first pointer reaches the end.
The second pointer will now be at the k-th node from the end.
Swap their values.
Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1)
Concepts Used
Linked List
Two Pointers
Traversal
In-place Swapping
