class Solution {
    public int findMin(int[] nums) {
        var left = 0;
        var right = nums.length-1;
        var min = Integer.MAX_VALUE;
        while(left<=right){
            var mid = (right+left)/2;
            var midValue = nums[mid];


            if(midValue < nums[right]){
                  right = mid;
                 
            
            }else{
                  left = mid +1;
            }

            if(midValue < min){
                min = midValue;
            }
        }

        return min;
    }
}
