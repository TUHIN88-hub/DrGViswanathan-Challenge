Problem 2: Excel Sheet Column Title (LeetCode 168)
Problem Statement

Given an integer columnNumber, return its corresponding Excel sheet column title.

Approach
Treat the column number as a base-26 representation.
Decrease the number by 1 before each operation because Excel indexing starts from 1 instead of 0.
Extract characters using modulo 26 and build the title in reverse order.
Reverse the obtained string to get the final Excel column title.
Complexity
Time Complexity: O(log₍26₎ n)
Space Complexity: O(log₍26₎ n)
Concepts Used
Mathematics
Base Conversion
StringBuilder
Modulo Arithmetic
