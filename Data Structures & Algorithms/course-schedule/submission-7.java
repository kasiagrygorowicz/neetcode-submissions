class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // subject, depdens on
        var nodes = new HashMap<Integer, Set<Integer>>();
        
        for(int[] crs : prerequisites){
            if(!nodes.containsKey(crs[0])){
                nodes.put(crs[0], new HashSet<>());
            }

            nodes.get(crs[0]).add(crs[1]);
        }

        for(int[] crs : prerequisites){
            if(!dfs(crs[1], nodes, new HashSet<Integer>())) return false;
        }

        return true;

    }

    private boolean dfs(int crs, HashMap<Integer, Set<Integer>> nodes, HashSet<Integer> visited){

        if(visited.contains(crs)) return false;
        if(nodes.get(crs) ==  null || nodes.get(crs).size()==0){
            return true;
        }

        visited.add(crs);
        for(int d : nodes.get(crs)){
            if(!dfs(d, nodes, visited)) return false;
        }
        nodes.get(crs).clear();
        visited.remove(crs);


        return true;
    }

}
