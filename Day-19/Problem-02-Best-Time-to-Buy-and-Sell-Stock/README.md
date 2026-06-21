# 121. Best Time to Buy and Sell Stock

## Problem Statement

Given an array `prices` where `prices[i]` represents the price of a stock on the `i-th` day, find the maximum profit that can be achieved by choosing one day to buy the stock and a future day to sell it.

If no profit can be made, return 0.

---

## Approach

Use a greedy approach by keeping track of the minimum stock price seen so far.

- Traverse the array from left to right.
- Update the minimum price whenever a smaller value is found.
- Calculate the profit that can be earned by selling on the current day.
- Update the maximum profit whenever a larger profit is obtained.

---

## Algorithm

1. Initialize `minPrice` with a very large value.
2. Initialize `maxProfit` as 0.
3. Traverse each stock price:
   - Update the minimum buying price.
   - Calculate the profit with the current selling price.
   - Update the maximum profit.
4. Return the maximum profit.

---

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

---

## Concepts Used

- Arrays
- Greedy Algorithm
- Single Pass Traversal
- Minimum Tracking
- Optimization Techniques
