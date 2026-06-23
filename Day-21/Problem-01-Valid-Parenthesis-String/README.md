# 678. Valid Parenthesis String

## Problem Statement

Given a string containing `'('`, `')'`, and `'*'`, determine whether the string can be considered valid.

The wildcard `'*'` can represent:
- `'('`
- `')'`
- An empty string

Return `true` if the string can be valid, otherwise return `false`.

---

## Approach

Use a greedy approach by maintaining a range of possible open parentheses counts.

- `low` stores the minimum possible number of open brackets.
- `high` stores the maximum possible number of open brackets.

As we process each character:
- `'('` increases both values.
- `')'` decreases both values.
- `'*'` decreases `low` and increases `high`.

If `high` becomes negative, the string is invalid.

At the end, if `low` equals zero, a valid arrangement exists.

---

## Algorithm

1. Initialize `low = 0` and `high = 0`.
2. Traverse the string character by character.
3. Update the range based on the current character.
4. If `high < 0`, return false.
5. Keep `low` non-negative.
6. Return whether `low == 0`.

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

---

## Concepts Used

- Greedy Algorithm
- String Processing
- Parentheses Matching
- Range Tracking
