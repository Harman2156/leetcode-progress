# Majority Element (Boyer–Moore Voting Algorithm)

## 🧠 Problem Statement
Given an array of integers `arr` of size `n`, return the **majority element**.

The majority element is the element that appears **more than ⌊n / 2⌋ times**.  
You may assume that the majority element **always exists** in the array.

---

## 💡 Approach
This solution uses the **Boyer–Moore Voting Algorithm**, which efficiently finds the majority element in:

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

### 🔍 Key Idea
- Maintain a `vote` count and a `candidate` (`maj`)
- Increase the vote if the current element matches the candidate
- Decrease the vote otherwise
- When votes reach zero, select a new candidate


