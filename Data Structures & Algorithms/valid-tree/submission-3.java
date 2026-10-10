class Solution {

    private Map<Integer,Set<Integer>> nodes = new HashMap<>();

    public boolean validTree(int n, int[][] edges) {
        if(edges.length != n -1 ) return false;
        if(edges.length == 0) return true;


        for(int[] na : edges){
            if(!nodes.containsKey(na[0])){
                nodes.put(na[0], new HashSet<>());
            }

             if(!nodes.containsKey(na[1])){
                nodes.put(na[1], new HashSet<>());
            }

            nodes.get(na[0]).add(na[1]);
            nodes.get(na[1]).add(na[0]);
        }

        Set<Integer> visited = new HashSet<>();
        return dfs(null, 0, visited);
    }

    private boolean dfs(Integer parent, Integer current, Set<Integer> visited){
        if(visited.contains(current)) return false;

        visited.add(current);

        for(Integer n : nodes.get(current)){
            if(n == parent) continue;
            if(!dfs(current,n, visited)) return false;

        }

        if(parent ==null){
            return nodes.size() == visited.size();
        }
        return true;
    }


}
