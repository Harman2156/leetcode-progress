# Trapping Rain Water

## 🧩 Problem Statement

You are given an integer array `height` where `height[i]` represents the height of a bar at index `i`.

Each bar has a width of `1`. After raining, water can be trapped between the bars.

Return the **total amount of water** that can be trapped.

---

## 🔹 Example 1

**Input**
height = [0,1,0,2,1,0,1,3,2,1,2,1]


**Output**
6


---

## 🔹 Example 2

**Input**
height = [4,2,0,3,2,5]


**Output**
9


---

## 💡 Key Observation

Water trapped at any index depends on:

minimum(max height on the left, max height on the right) - height[i]


Water can only be trapped if there are **taller bars on both sides**.

---

## 🧠 Approach: Two Pointer Technique

Instead of using extra arrays to store left and right maximum heights, we can solve this problem efficiently using **two pointers**.

### Idea
- Use two pointers: `left` and `right`
- Maintain two variables:
  - `leftMax` → maximum height seen so far from the left
  - `rightMax` → maximum height seen so far from the right
- Always move the pointer with the **smaller maximum height**, because water is limited by the smaller boundary

---

## 🔁 Algorithm Steps

1. Initialize `left = 0`, `right = n - 1`
2. Initialize `leftMax = 0`, `rightMax = 0`
3. While `left < right`:
   - Update `leftMax` and `rightMax`
   - If `leftMax < rightMax`:
     - Water trapped = `leftMax - height[left]`
     - Move `left`
   - Else:
     - Water trapped = `rightMax - height[right]`
     - Move `right`
4. Accumulate trapped water
