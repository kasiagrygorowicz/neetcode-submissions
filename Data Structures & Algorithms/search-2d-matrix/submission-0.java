class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        var rows = matrix.length;
        var columns = matrix[0].length;

        int top =0, bottom = rows-1;
        while(top<=bottom){
            var row = (top+bottom)/2;
            if(target > matrix[row][columns-1]){
                top = row+1;
            }else if (target < matrix[row][0]){
                bottom = row-1;
            }else{
                break;
            }
        }

            if (!(top <= bottom)) {
            return false;
            }

            var row = (top +bottom)/2;
            var left =0;
            var right = columns-1;
            while(left<=right){
                var index = (left+right)/2;
                var mid = matrix[row][index];
                if(mid > target){
                    right = index -1;
                
                }else if (mid<target){
                    left = index+1;
                }else{
                    return true;
                }
            }

            return false;



        

    }
}
