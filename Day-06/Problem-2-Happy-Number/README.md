Problem 2 – Happy Number
Problem Link

https://leetcode.com/problems/happy-number/

Difficulty

Easy

Approach

Instead of using a HashSet to track visited numbers, we use Floyd's Cycle Detection Algorithm.

Compute the next number by summing the squares of its digits.
Use slow and fast pointers.
If fast becomes 1, the number is happy.
If slow and fast meet, a cycle exists.
Algorithm
Create a helper function to calculate the sum of squares of digits.
Initialize slow = n and fast = next(n).
Move slow one step and fast two steps.
Continue until:
fast becomes 1 → Happy Number.
slow equals fast → Cycle detected.
Return the result.
Complexity
Time Complexity: O(log n)
Space Complexity: O(1)
Java Solution
class Solution {

    private int getNext(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }
}
