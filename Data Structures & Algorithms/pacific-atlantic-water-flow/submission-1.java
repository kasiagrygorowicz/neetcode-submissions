class Solution {
    private int[][] directions = {{1, 0}, {-1, 0},
                                  {0, 1}, {0, -1}};


    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        var result = new ArrayList<List<Integer>>();
        if(heights.length == 0) return result;
        int rows = heights.length;
        int columns = heights[0].length;

        var pacific = new boolean[rows][columns];
        var atlantic= new boolean[rows][columns];

        for(int r =0; r < rows; r++){
            dfs(r, 0, pacific, heights);
            dfs(r, columns-1, atlantic, heights);
        }

        for(int c=0; c < columns; c++){
            dfs(0, c, pacific, heights);
            dfs(rows-1, c, atlantic, heights);
        }

    
        for(int r =0; r <rows;r++ ){
            for(int c =0; c< columns; c++){
                if(pacific[r][c] && atlantic[r][c]){
                    result.add(List.of(r,c));
                }
            }
        }


        return result;
    }


    private void dfs(int row, int col, boolean[][] ocean, int[][] grid){
       ocean[row][col] = true;
       for(int[] d : directions){
        var nr = row + d[0];
        var nc = col + d[1];
        if(nr >= 0 && nr < grid.length && 
            nc >=0 && nc < grid[0].length &&
        !ocean[nr][nc] &&
        grid[nr][nc] >= grid[row][col]
        ){
            dfs(nr,nc,ocean,grid);
        }
       }
    }
}
