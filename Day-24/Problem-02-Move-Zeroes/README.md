# Problem 2: Move Zeroes

## Problem Statement
Given an integer array `nums`, move all `0`s to the end while maintaining the relative order of the non-zero elements. The operation must be performed in-place.

---

## Approach
- Use a two-pointer technique.
- One pointer traverses the array.
- The other pointer keeps track of the next position for a non-zero element.
- Whenever a non-zero element is found, swap it with the element at the second pointer.
- This preserves the order of non-zero elements and shifts all zeroes to the end.

---

## Algorithm
1. Initialize pointer `j = 0`.
2. Traverse the array.
3. If the current element is non-zero:
   - Swap it with `nums[j]`.
   - Increment `j`.
4. Continue until the end of the array.

---

## Time Complexity
**O(n)**

## Space Complexity
**O(1)**

---

## Concepts Used
- Arrays
- Two Pointers
- In-place Swapping
- Traversal
