# Dr. G. Viswanathan Coding Challenge  
# Day 18 Progress

Welcome to **Day 18** of my **Dr. G. Viswanathan Coding Challenge** journey. Today's challenges focused on strengthening my understanding of **data structures, stack and queue implementation, hashing, and efficient problem-solving techniques using Java**.

---

# Problems Solved

## Problem 1: Implement Queue using Stacks  
**Platform:** LeetCode  
**Difficulty:** Easy  

### Key Concepts:
- Queue (FIFO)
- Stack (LIFO)
- Data Structure Design
- Amortized Analysis

### Approach:
Implemented a queue using two stacks:
- An input stack stores newly added elements.
- An output stack provides elements in queue order.

Whenever the output stack becomes empty, elements from the input stack are transferred to it, reversing their order and maintaining FIFO behavior.

### Complexity Analysis:
- **Push:** O(1)
- **Pop:** O(1) amortized
- **Peek:** O(1) amortized
- **Empty:** O(1)

---

## Problem 2: Contains Duplicate  
**Platform:** LeetCode  
**Difficulty:** Easy  

### Key Concepts:
- Arrays
- Hashing
- HashSet
- Efficient Searching

### Approach:
Traversed the array while storing elements in a HashSet. Before adding an element, checked whether it already existed in the set. If it was found, a duplicate existed and the function returned `true`; otherwise, the element was added to the HashSet.

### Complexity Analysis:
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

# Day 18 Summary

| Problem | Topic | Difficulty |
|---------|-------|------------|
| Implement Queue using Stacks | Stack, Queue, Design | Easy |
| Contains Duplicate | Array, HashSet, Searching | Easy |

---

# Learning Outcome

Day 18 helped me strengthen my understanding of:

- Designing one data structure using another
- Implementing Queue behavior using Stacks
- Using HashSet for fast lookup operations
- Optimizing solutions from brute-force approaches
- Understanding time and space complexity analysis
- Writing clean and efficient Java code

---

**Total Problems Solved Today: 2/3 ✅**

**Challenge:** Dr. G. Viswanathan Coding Challenge  
**Language Used:** Java ☕  
**Status:** Day 18 In Progress 🚀
