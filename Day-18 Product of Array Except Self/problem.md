# Product of Array Except Self

## 🧩 Problem Statement

Given an integer array `nums`, return an array `answer` such that:

- `answer[i]` is equal to the **product of all the elements of `nums` except `nums[i]`**.
- You must solve the problem **without using the division operator**.
- The solution must run in **O(n)** time complexity.

---

## ✨ Constraints

- `2 <= nums.length <= 10^5`
- `-30 <= nums[i] <= 30`
- The product of any prefix or suffix of `nums` fits in a **32-bit integer**

---

## 📌 Examples

### Example 1
Input: nums = [1, 2, 3, 4]
Output: [24, 12, 8, 6]


### Example 2
Input: nums = [-1, 1, 0, -3, 3]
Output: [0, 0, 9, 0, 0]


---

## 💡 Approach (Prefix & Suffix Product)

To solve this efficiently:
1. Create a **prefix product array** where each index stores the product of elements before it.
2. Create a **suffix product array** where each index stores the product of elements after it.
3. Multiply prefix and suffix values for each index to get the final answer.

This avoids division and works in linear time.

---

## 🧠 Algorithm

1. Initialize `pfx[0] = 1`
2. Fill prefix array from left to right
3. Initialize `sfx[n-1] = 1`
4. Fill suffix array from right to left
5. Compute result:  
   `answer[i] = pfx[i] * sfx[i]`

---

## 🧪 Java Implementation

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pfx = new int[n];
        int[] sfx = new int[n];
        int[] ans = new int[n];

        pfx[0] = 1;
        for (int i = 1; i < n; i++) {
            pfx[i] = pfx[i - 1] * nums[i - 1];
        }

        sfx[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            sfx[i] = sfx[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = pfx[i] * sfx[i];
        }

        return ans;
    }
}
