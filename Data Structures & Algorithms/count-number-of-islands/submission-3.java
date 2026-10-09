class Solution {

    private int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        var q = new ArrayDeque<int[]>();
        var visit =  new boolean[grid.length][grid[0].length];
        var counter =0;
        for(int r = 0; r < grid.length; r++){
            for( int c =0; c < grid[0].length; c++){
                if(!visit[r][c] && grid[r][c] == '1'){
                    visit[r][c]= true;
                q.offer(new int[]{r,c});
                bfs(grid,q,visit);
                counter++;
                }
                
            }
        }
        return counter;
       
    }

    private void bfs(char[][] grid,ArrayDeque<int[]> queue, boolean[][] visited){
         while(queue.size() != 0){
            var cell =  queue.poll();
            var r = cell[0];
            var c  =  cell[1];
            for(int[] d : directions){
                if(grid.length > r+d[0] && r+d[0] >=0 &&
                grid[0].length > c +d[1] && c +d[1] >= 0 &&
                grid[r+d[0]][c +d[1]] == '1' &&
                visited[r+d[0]][c +d[1]] == false
                ){
                    visited[r+d[0]][c +d[1]] =  true;
                    queue.offer(new int[]{r+d[0],c +d[1]});

                }
        
            }
           
        }
    }


}
