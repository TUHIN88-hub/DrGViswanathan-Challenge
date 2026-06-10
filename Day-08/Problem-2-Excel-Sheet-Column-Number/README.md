# Excel Sheet Column Number

## Problem

Given an Excel column title, return its corresponding column number.

Examples:

* A → 1
* Z → 26
* AA → 27
* AB → 28

## Approach

Treat the column title as a Base-26 number.

For each character:

1. Convert it to its value:

   * A = 1
   * B = 2
   * ...
   * Z = 26
2. Update:
   result = result × 26 + value

## Time Complexity

O(n)

## Space Complexity

O(1)

## Concepts Used

* Strings
* Base Conversion
* Mathematics
