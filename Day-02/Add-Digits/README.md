# Add Digits (LeetCode 258)

## Difficulty

Easy

## Language

Java

## Problem Statement

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

### Example

Input:
38

Output:
2

Explanation:

38 → 3 + 8 = 11

11 → 1 + 1 = 2

Therefore, the answer is 2.

---

## Approach

This problem can be optimized using the Digital Root concept.

Instead of repeatedly summing digits, use:

If num == 0:
return 0

Otherwise:
return 1 + (num - 1) % 9

This provides an O(1) solution without loops or recursion.

---

## Java Solution

```java
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}
```

## Complexity Analysis

* Time Complexity: O(1)
* Space Complexity: O(1)

## Concepts Practiced

* Mathematics
* Number Theory
* Digital Root
* Optimization
* Constant Time Algorithms
