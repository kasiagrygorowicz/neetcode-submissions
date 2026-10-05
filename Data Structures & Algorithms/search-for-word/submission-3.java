class Solution {

    private final int[][] directions = new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
    public boolean exist(char[][] board, String word) {
        var rows = board.length;
        var columns = board[0].length;

        for(int r=0; r<rows;r++){
            for(int c=0; c<columns;c++){
                    var res = search(r, c, board, word, 0);
                    if(res) return true;
            }
        }

        return false;
    }

    private boolean search(int r, int c, char[][]board, String word, int index){
        if(index == word.length()) return true;; 
        if(r <0 || r >= board.length || c< 0 || c >= board[0].length) return false;
        var tmp = board[r][c];
        if(board[r][c] != '#' && board[r][c] == word.charAt(index)){
            board[r][c] = '#';
            for(int[] dir : directions){
                var res = search(r+dir[0], c+ dir[1], board, word, index+1);
                if(res){
                    return true;
                }
            }
            board[r][c] = tmp;
           
        }

        return false;
    }
}
