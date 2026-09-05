class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] squares = new HashSet[9];

        for(int i =0; i< 9;i++){
            cols[i] = new HashSet<Character>();
            rows[i] = new HashSet<Character>();
            squares[i] = new HashSet<Character>();
        }

        for(int r =0; r<9; r++){
            for(int c=0;c<9;c++){
                var val = board[r][c];
                if(val == '.') continue;

                var boxIndex = (r/3)*3 +c/3;
                if(rows[r].contains(val)||cols[c].contains(val)|| squares[boxIndex].contains(val)){
                    return false;
                } 

                rows[r].add(val);
            cols[c].add(val);
            squares[boxIndex].add(val);
            }
        }

        return true;
    }
}
