# Valid Perfect Square (LeetCode 367)

## Difficulty

Easy

## Language

Java

## Problem Statement

Given a positive integer num, return true if num is a perfect square or false otherwise.

You must not use any built-in library function such as sqrt().

---

## Approach

Use Binary Search.

1. Search in the range [1, num].
2. Compute mid × mid.
3. If equal to num, return true.
4. If smaller, search right half.
5. Otherwise, search left half.

---

## Java Solution

```java
class Solution {
    public boolean isPerfectSquare(int num) {

        long left = 1;
        long right = num;

        while (left <= right) {

            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
```

## Complexity Analysis

- Time Complexity: O(log n)
- Space Complexity: O(1)

## Concepts Practiced

- Binary Search
- Mathematical Problems
- Overflow Handling
- Optimization
