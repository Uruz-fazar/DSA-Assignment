# 🚀 DSA Assignment (Java)

This repository contains solutions to two Data Structures & Algorithms problems implemented in Java.
Both programs are written in a clean and beginner-friendly style and can be executed using the command line.

---

# 📌 Problem 1: Cyclic Substring Maximum Sum

## 🧠 Problem Statement

You are given a string `S` of lowercase English letters.

Each character has a value:

* a = 1, b = 2, ..., z = 26

You can select a **cyclic substring**, meaning the substring can wrap from the end of the string to the beginning.

### 🎯 Goal:

Find the **maximum sum** of a substring such that:

* All characters are **unique**

---

## 💡 Approach (Simple Explanation)

* Convert string into cyclic form by doubling it
* Use **sliding window technique**
* Use a `HashSet` to ensure characters are unique
* Expand window when characters are unique
* Shrink window when duplicate appears
* Track maximum sum

---

## ▶️ Input

Program will ask:

```
Enter the string:
```

### Example:

```
abca
```

---

## ▶️ Output

```
Maximum Cyclic Substring Sum (Unique Characters): 6
```

---

## 🧪 Example Explanation

Valid cyclic substrings:

* abc → 1 + 2 + 3 = 6
* bca → 2 + 3 + 1 = 6

Maximum = **6**

---

## ⏱ Time Complexity

```
O(n)
```

---

# 📌 Problem 2: Array Transformation Cost Minimization

## 🧠 Problem Statement

You are given:

* An integer array `A`
* An integer `K`

You can perform:

```
A[i] = A[i] + K
A[i] = A[i] - K
```

### 🎯 Goal:

Make all elements equal using minimum operations.

---

## 💡 Approach (Simple Explanation)

* Check if transformation is possible:

  * All elements must differ by multiples of `K`
* Sort the array
* Choose the **median** as target value
* Count operations needed to convert each element to target

---

## ▶️ Input

Program will ask step-by-step: 

```
Enter size of array:
Enter elements:
Enter value of K:
```

### Example:

```
5
2 4 6 8 10
2
```

---

## ▶️ Output

```
Minimum operations: 6
```

---

## 🧪 Example 

Target = 6

Operations:

* 2 → 6 → 2 steps
* 4 → 6 → 1 step
* 6 → 6 → 0 steps
* 8 → 6 → 1 step
* 10 → 6 → 2 steps

Total = **6**

---

## ⏱ Time Complexity

```
O(n log n)
```

---

# ▶️ How to Run (Command Prompt)

## 🔹 Step 1: Compile

```
javac Problem1CyclicSubstring.java
javac ArrayTransformationCost.java
```

---

## 🔹 Step 2: Run

### Problem 1:

```
java Problem1CyclicSubstring
```

### Problem 2:

```
java ArrayTransformationCost
```

---

# 📥 Input Summary

## Problem 1:

* Single string input

## Problem 2:

* First line → size of array
* Second line → elements
* Third line → value of K

---

# 👩‍💻 Author

Uruz fazar

---

# ⭐ Notes

* Both solutions are optimized and efficient
* Works for large inputs (up to 10⁵)
* Uses standard Java libraries
* Code is clean and easy to understand

---
