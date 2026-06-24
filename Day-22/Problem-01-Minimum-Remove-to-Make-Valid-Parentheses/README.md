# 1249. Minimum Remove to Make Valid Parentheses

## Problem Statement

Given a string containing lowercase English letters and parentheses, remove the minimum number of parentheses so that the resulting string becomes valid.

Return any valid string after the removals.

---

## Approach

The solution uses two passes:

1. Traverse from left to right and remove invalid closing parentheses.
2. Traverse from right to left and remove unmatched opening parentheses.

Finally, construct the resulting valid string by skipping removed characters.

---

## Algorithm

1. Initialize a counter for open brackets.
2. Scan left to right:
   - Count '('.
   - Match ')' when possible.
   - Mark invalid ')' for removal.
3. Scan right to left:
   - Remove remaining unmatched '('.
4. Build the final string excluding removed characters.
5. Return the valid string.

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(n)

---

## Concepts Used

- Strings
- Greedy Processing
- Parentheses Matching
- Two-Pass Traversal
