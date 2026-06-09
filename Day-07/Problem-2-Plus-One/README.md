# Plus One

## Problem
Given a large integer represented as an array of digits, increment the integer by one and return the resulting array.

## Approach
- Traverse from the last digit.
- Add one if digit < 9.
- Otherwise set current digit to 0 and carry forward.
- If all digits are 9, create a new array with leading 1.

## Time Complexity
O(n)

## Space Complexity
O(1)
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}
