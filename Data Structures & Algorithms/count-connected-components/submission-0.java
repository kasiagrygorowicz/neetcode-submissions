class Solution {

    private Map<Integer, Set<Integer>> nodes= new HashMap();
    public int countComponents(int n, int[][] edges) {
            for(int i=0; i< n; i++){
                nodes.put(i, new HashSet());
            }

            for(int[] e : edges){
                nodes.get(e[0]).add(e[1]);
                nodes.get(e[1]).add(e[0]);
            }


            int components = 0;
            var visited = new HashSet<Integer>();
            while(visited.size() != n){
                var next  = -1;
                for(Integer i : nodes.keySet()){
                    if(!visited.contains(i)){
                        next = i;
                        break;
                    }
                }
                dfs(next, -1, visited);
                components++;
            }

            return components;
    }


    private void dfs(Integer current, Integer prev, Set<Integer> visited){
        if(visited.contains(current))return;

        visited.add(current);
        for(Integer next : nodes.get(current)){
            if(next.equals(prev)) continue;
            dfs(next, current, visited);
        }
    }



    
}
