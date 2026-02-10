class Solution {
    public boolean isBipartite(int[][] graph) {
      
        int n = graph.length;
        int[] color = new int[n]; // 0 = uncolored, 1 & 2 = colors

        for (int i = 0; i < n; i++) {
            if (color[i] != 0) continue; // already visited

            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            color[i] = 1;

            while (!q.isEmpty()) {
                int node = q.poll();

                for (int nei : graph[node]) {
                    if (color[nei] == 0) {
                        color[nei] = 3 - color[node]; // flip color
                        q.add(nei);
                    } else if (color[nei] == color[node]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
 
  