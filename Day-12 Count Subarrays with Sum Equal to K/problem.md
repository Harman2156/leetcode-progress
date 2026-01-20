# Subarray Sum Equals K

## 🧩 Problem Statement

Given an integer array `arr` of length `n` and an integer `K`, determine the **total number of contiguous subarrays** whose sum is **exactly equal to `K`**.

- A subarray is a **contiguous** part of the array.
- **Overlapping subarrays are allowed.**

---

## ✨ Example

### Input
arr = [2, -1, 4, 3, 6, 4, 5, 1]
K = 6


### Output
4

### Explanation
The subarrays whose sum equals `6` are:
- `[2, -1, 4, 1]`
- `[3, 3]`
- `[6]`
- `[4, 1, 1]`

---

## 🧠 Approach: Prefix Sum + HashMap

### Key Insight

If the sum of a subarray from index `i` to `j` is `K`, then:


So, for every index `j`, we check how many times  
`(currentPrefixSum - K)` has appeared before.

---

## 🛠️ Algorithm

1. Compute the prefix sum array.
2. Use a `HashMap` to store the frequency of prefix sums.
3. Traverse the prefix array:
   - If `prefixSum == K`, increment the count.
   - If `(prefixSum - K)` exists in the map, add its frequency to the count.
   - Store/update the current prefix sum in the map.
