# Find if Path Exists in Graph (BFS)

## Problem Statement

You are given an undirected (bi-directional) graph with `n` vertices labeled from `0` to `n-1`.

The graph is represented using an edge list `edges`, where each `edges[i] = [u, v]` denotes an undirected edge between vertex `u` and vertex `v`.

You are also given two integers:
- `source` – starting vertex
- `destination` – target vertex

Your task is to determine whether there exists **any valid path** from `source` to `destination`.

Return `true` if a path exists, otherwise return `false`.

---

## Examples

### Example 1
**Input:**
n = 3
edges = [[0,1],[1,2],[2,0]]
source = 0
destination = 2


**Output:**
true


**Explanation:**  
There exists a path from `0` to `2`.

---

### Example 2
**Input:**
n = 6
edges = [[0,1],[0,2],[3,5],[5,4],[4,3]]
source = 0
destination = 5


**Output:**
false


**Explanation:**  
The source and destination belong to different connected components.

---

## Approach

1. Convert the given **edge list** into an **adjacency list** to efficiently store the graph.
2. Use **Breadth First Search (BFS)** starting from the `source` node.
3. Maintain a `visited[]` array to avoid revisiting nodes.
4. Traverse all reachable nodes using a queue.
5. After BFS traversal, check if `destination` was visited.

---

## Why Adjacency List?

- Adjacency Matrix requires `O(n²)` space, which causes **Memory Limit Exceeded** for large inputs.
- Adjacency List uses `O(n + edges)` space and is suitable for large graphs.

---

## Algorithm (BFS)

1. Initialize a queue and add the source node.
2. Mark the source as visited.
3. While the queue is not empty:
   - Remove the front node.
   - Visit all its unvisited neighbors.
4. After traversal, return whether `destination` is visited.

---

## Code Implementation

```java
import java.util.*;

class Solution {

    public static void bfs(int n, List<List<Integer>> graph, int source, boolean[] vist) {

        Queue<Integer> m = new LinkedList<>();
        m.add(source);
        vist[source] = true;

        while (!m.isEmpty()) {
            int val = m.poll();

            for (int nei : graph.get(val)) {
                if (!vist[nei]) {
                    vist[nei] = true;
                    m.add(nei);
                }
            }
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        boolean[] vist = new boolean[n];
        bfs(n, graph, source, vist);

        return vist[destination];
    }
}
