# Next Greater Element II (Circular Array)

## 🧩 Problem Statement

Given a circular integer array `nums`, return an array `ans` where  
`ans[i]` is the **next greater element** of `nums[i]`.

The **next greater element** of a number `x` is the first greater number
to its **right** while traversing the array circularly.
If no such element exists, return `-1` for that position.

A circular array means the end of the array connects back to the beginning.

---

## 🔹 Example 1

**Input**
nums = [1, 2, 1]


**Output**
[2, -1, 2]


**Explanation**
- Next greater of `1` → `2`
- Next greater of `2` → none → `-1`
- Next greater of `1` → `2` (found after wrapping around)

---

## 🔹 Example 2

**Input**
nums = [3, 8, 4, 1, 2]


**Output**
[8, -1, 8, 2, 3]


---

## 💡 Approach

To handle the circular nature of the array:

- Traverse the array **twice** (from `2*n - 1` to `0`)
- Use a **monotonic decreasing stack**
- Access elements using `i % n` to simulate circular traversal
- Store answers only when `i < n` (original array indices)

---

## 🧠 Key Observations

- Stack stores **possible next greater elements**
- Smaller or equal elements are removed from the stack
- The first greater element on the stack top is the answer
- Extra traversal helps simulate circular behavior

---

## 🧪 Algorithm Steps

1. Initialize an answer array of size `n`
2. Use a stack to keep elements in decreasing order
3. Loop from `2*n - 1` down to `0`
4. Remove elements from stack smaller or equal to current element
5. If `i < n`, store the result
6. Push current element into the stack

---

## 🧾 Java Implementation

```java
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(nums[i % n]);
        }
        return ans;
    }
}
