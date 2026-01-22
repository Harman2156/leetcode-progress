# Previous Smaller Element

## 📌 Problem Statement

Given an integer array `arr[]`, for each element in the array, find the **previous smaller element**.

The previous smaller element of an element `arr[i]` is the **nearest element to the left** of `arr[i]` that is **strictly smaller** than `arr[i]`.

If no such element exists, output `-1` for that position.

---

## 🔍 Explanation

- Traverse the array from **left to right**
- Use a **stack** to keep track of elements
- While the stack is not empty and the top element is **greater than or equal** to the current element, pop it
- If the stack becomes empty, there is **no previous smaller element**
- Otherwise, the stack’s top element is the answer for the current index

---

## 🧠 Approach (Using Stack)

1. Initialize an empty stack
2. Initialize an empty result list
3. For each element in the array:
   - Pop elements from the stack while they are `>= current element`
   - If stack is empty → add `-1` to result
   - Else → add `stack.peek()` to result
   - Push current element into the stack

---

## ✅ Example

### Input
arr = [4, 5, 2, 10, 8]


### Output
[-1, 4, -1, 2, 2]


### Explanation
| Element | Previous Smaller |
|--------|------------------|
| 4      | -1               |
| 5      | 4                |
| 2      | -1               |
| 10     | 2                |
| 8      | 2                |

---

## ⏱️ Time & Space Complexity

- **Time Complexity:** `O(n)`  
  (Each element is pushed and popped at most once)

- **Space Complexity:** `O(n)`  
  (Stack + result list)

---

## 💻 Java Implementation

```java
class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        Stack<Integer> m = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!m.isEmpty() && m.peek() >= arr[i]) {
                m.pop();
            }

            if (m.isEmpty()) {
                lst.add(-1);
            } else {
                lst.add(m.peek());
            }

            m.push(arr[i]);
        }

        return lst;
    }
}
