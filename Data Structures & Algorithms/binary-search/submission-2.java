class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            var index = (right+left)/2;
            int mid = nums[index];
            if(mid == target){
                return index;
            }

            if(mid > target){
                right = index-1;
            }else{
                left = index+1;
            }

            
        }

        return -1;
    }
}
