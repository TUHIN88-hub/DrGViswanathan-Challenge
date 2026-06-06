# Palindrome Number (LeetCode 9)

## Difficulty

Easy

## Language

Java

## Problem Statement

Given an integer x, return true if x is a palindrome, and false otherwise.

A palindrome number reads the same forward and backward.

---

## Approach

1. Store the original number.
2. Reverse the digits using modulo and division operations.
3. Compare the reversed number with the original.
4. Return true if both are equal.

---

## Java Solution

```java
class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
```

## Complexity Analysis

- Time Complexity: O(log n)
- Space Complexity: O(1)

## Concepts Practiced

- Number Manipulation
- Digit Extraction
- Mathematical Logic
- Space Optimization
