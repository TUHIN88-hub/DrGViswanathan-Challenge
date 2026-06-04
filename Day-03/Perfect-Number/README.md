# Perfect Number (LeetCode 507)

## Difficulty

Easy

## Language

Java

## Problem Statement

A perfect number is a positive integer that is equal to the sum of its positive divisors excluding itself.

Given an integer n, return true if n is a perfect number, otherwise return false.

---

## Approach

Instead of checking all numbers from 1 to n, iterate only up to √n.

Whenever a divisor is found:

i divides num

Then:

num / i

is also a divisor.

Add both divisors to the sum.

Finally compare the sum with the original number.

---

## Java Solution

```java
class Solution {
    public boolean checkPerfectNumber(int num) {

        if (num == 1) return false;

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {

                sum += i;

                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
```

## Complexity Analysis

- Time Complexity: O(√n)
- Space Complexity: O(1)

## Concepts Practiced

- Mathematics
- Number Theory
- Divisor Enumeration
- Square Root Optimization
