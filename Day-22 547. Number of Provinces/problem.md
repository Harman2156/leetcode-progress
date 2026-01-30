# Number of Provinces (BFS)

## 🧠 Problem Statement

You are given an `n x n` matrix `isConnected` where:

- `isConnected[i][j] = 1` means city `i` is directly connected to city `j`
- `isConnected[i][j] = 0` means they are not connected

A **province** is a group of cities that are directly or indirectly connected.

Return the **total number of provinces**.

---

## 📌 Example

Input:

```
isConnected = [
  [1,1,0],
  [1,1,0],
  [0,0,1]
]
```

Output:

```
2
```

Explanation:

- Cities 0 and 1 are connected → Province 1
- City 2 is separate → Province 2

---

## 🚀 Approach (BFS)

We treat the matrix as a graph:

- Each city = node
- Matrix = adjacency matrix
- Use BFS to explore connected components

Steps:

1. Create a visited array
2. Loop through all cities
3. If a city is not visited:
   - run BFS
   - mark all reachable cities
   - increase province count

---

## 💡 Java Implementation

```java
import java.util.*;

class Solution {

    public static void bfs(int n, boolean vist[], int[][] isConnected) {
        Queue<Integer> m = new LinkedList<>();
        int y = isConnected.length;

        vist[n] = true;
        m.add(n);

        while (!m.isEmpty()) {
            int h = m.poll();

            for (int j = 0; j < y; j++) {
                if (isConnected[h][j] == 1 && !vist[j]) {
                    m.add(j);
                    vist[j] = true;
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        boolean vist[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vist[i]) {
                count++;
                bfs(i, vist, isConnected);
            }
        }

        return count;
    }
}
```

---

## ⏱ Time Complexity

```
O(n²)
```

We scan the adjacency matrix.

---

## 📦 Space Complexity

```
O(n)
```

Visited array + BFS queue.

---

## ✅ Key Concept

This problem is equivalent to finding the number of **connected components** in a graph using BFS.

