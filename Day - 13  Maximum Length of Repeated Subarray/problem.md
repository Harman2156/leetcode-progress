# Longest Common Subarray

## 🧩 Problem Statement

You are given two integer arrays `nums1` and `nums2`.

Your task is to find the **maximum length of a subarray** that appears in **both arrays**.

> A **subarray** is a contiguous part of an array.

---

## 📌 Example

### Example 1
### Example 1
Input:
nums1 = [1, 2, 3, 2, 1]
nums2 = [3, 2, 1, 4, 7]

Output:
3

### Explanation
The longest common subarray is `[3, 2, 1]`, which has a length of **3**.

---

## 🧠 Approach

This problem is solved using **Dynamic Programming**.

### Key Idea
- Let `dp[i][j]` represent the length of the longest common subarray  
  ending at `nums1[i-1]` and `nums2[j-1]`.
- If `nums1[i-1] == nums2[j-1]`, then:

- Otherwise, the value remains `0` (default).

We keep track of the **maximum value** found in the DP table.


## 🧮 Algorithm Steps

1. Create a 2D DP array of size `(nums1.length + 1) × (nums2.length + 1)`
2. Iterate through both arrays
3. Compare elements and update DP table diagonally
4. Maintain a variable `maxi` to store the maximum length found



## 💻 Java Implementation

```java
class Solution {
  public int findLength(int[] nums1, int[] nums2) {

      int[][] dp = new int[nums1.length + 1][nums2.length + 1];
      int maxi = 0;

      for (int i = 1; i <= nums1.length; i++) {
          for (int j = 1; j <= nums2.length; j++) {
              if (nums1[i - 1] == nums2[j - 1]) {
                  dp[i][j] = dp[i - 1][j - 1] + 1;
                  maxi = Math.max(maxi, dp[i][j]);
              }
          }
      }
      return maxi;
  }
}
