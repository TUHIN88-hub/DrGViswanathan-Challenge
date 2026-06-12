# 319. Bulb Switcher

## Problem Statement

There are n bulbs that are toggled in multiple rounds.

- Round 1: Turn on every bulb.
- Round 2: Toggle every 2nd bulb.
- Round 3: Toggle every 3rd bulb.
- ...
- Round n: Toggle only the nth bulb.

Return the number of bulbs that remain ON after n rounds.

## Approach

A bulb is toggled once for every divisor of its position.

Most numbers have divisors in pairs:

12 → (1,12), (2,6), (3,4)

Hence they receive an even number of toggles and end up OFF.

Perfect squares have one unpaired divisor:

16 → (1,16), (2,8), (4,4)

Therefore they receive an odd number of toggles and remain ON.

The answer equals the number of perfect squares ≤ n:

Answer = floor(sqrt(n))

## Complexity Analysis

- Time Complexity: O(1)
- Space Complexity: O(1)

## Concepts Used

- Number Theory
- Perfect Squares
- Mathematical Observation
