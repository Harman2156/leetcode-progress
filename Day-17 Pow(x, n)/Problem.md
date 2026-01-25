# Pow(x, n) — Fast Power (Binary Exponentiation)

## 🧩 Problem Statement

Implement the function `pow(x, n)`, which calculates **x raised to the power n**  
(i.e., `xⁿ`).

You are given:
- A **double** `x`
- An **integer** `n`

Return `xⁿ`.

---

## 📌 Constraints

- `-100.0 < x < 100.0`
- `-2³¹ ≤ n ≤ 2³¹ - 1`
- `n` can be **negative**
- Result should be calculated efficiently

---

## 🚫 Restrictions

- **Do not** use built-in power functions like `Math.pow`
- The solution must run in **O(log n)** time

---

## 🧠 Approach (Fast Power / Binary Exponentiation)

Instead of multiplying `x` **n times** (which is slow), we use **divide and conquer**:

### Key Ideas:
- If `n == 0` → answer is `1`
- If `n` is negative → convert to positive using  
x = 1 / x
n = -n

- Recursively compute:
xⁿ = (xⁿ⁄²) × (xⁿ⁄²)

- If `n` is odd → multiply one extra `x`

This reduces time complexity from **O(n)** to **O(log n)**.

---

## 🧪 Example

### Example 1
Input: x = 2.0, n = 10
Output: 1024.0


### Example 2
Input: x = 2.0, n = -2
Output: 0.25


Explanation:
2⁻² = 1 / (2²) = 1 / 4 = 0.25


---

## ✅ Java Solution

```java
class Solution {
    public double myPow(double x, int n) {
        long N = n;   // convert to long to handle Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        if (n == 0) return 1.0;

        double half = fastPow(x, n / 2);

        if (n % 2 == 0)
            return half * half;
        else
            return half * half * x;
    }
}
