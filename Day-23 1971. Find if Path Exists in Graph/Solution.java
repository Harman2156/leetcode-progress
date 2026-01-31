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

        // adjacency list (memory efficient)
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] vist = new boolean[n];
        bfs(n, graph, source, vist);

        return vist[destination];
    }
}
