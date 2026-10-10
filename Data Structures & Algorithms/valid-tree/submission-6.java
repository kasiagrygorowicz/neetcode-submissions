class Solution {

    private Map<Integer, Set<Integer>> nodes = new HashMap<>();

    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) return false;

        for (int i = 0; i < n; i++) {
            nodes.put(i, new HashSet<>());
        }

        for (int[] edge : edges) {
            nodes.get(edge[0]).add(edge[1]);
            nodes.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();
        if (!dfs(-1, 0, visited)) return false;

        return visited.size() == n;
    }

    private boolean dfs(int parent, int current, Set<Integer> visited) {
        if (visited.contains(current)) return false;

        visited.add(current);

        for (int next : nodes.get(current)) {
            if (next == parent) continue;
            if (!dfs(current, next, visited)) return false;
        }

        return true;
    }
}