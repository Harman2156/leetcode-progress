# Best Time to Buy and Sell Stock II

## 🧩 Problem Statement

You are given an integer array `prices` where `prices[i]` represents the price of a stock on the `iᵗʰ` day.

On each day, you may decide to buy and/or sell the stock. You can hold **at most one share** of the stock at any time.  
However, you may complete **multiple transactions**, even on the same day, as long as you never hold more than one share at once.

Your task is to **calculate and return the maximum profit** that can be achieved.

---

## 📥 Input

- An integer array `prices`

---

## 📤 Output

- An integer representing the **maximum profit**

---

## 🔒 Constraints

- `1 <= prices.length <= 10⁵`
- `0 <= prices[i] <= 10⁴`

---

## 💡 Approach

The idea is to take advantage of **every increasing price sequence**.

- If the price of the next day is higher than today, buy today and sell tomorrow.
- Add the profit of every such transaction.
- This greedy approach guarantees the maximum profit.

---

## 🧠 Algorithm

1. Initialize `maxProfit = 0`
2. Traverse the array from day `0` to `n-2`
3. If `prices[i] < prices[i + 1]`:
   - Add `(prices[i + 1] - prices[i])` to `maxProfit`
4. Return `maxProfit`

---

## 🧪 Example

### Input
```text
prices = [7,1,5,3,6,4]

'''output
7
