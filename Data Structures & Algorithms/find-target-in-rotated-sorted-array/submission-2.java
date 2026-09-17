class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;
    
        while(l<=r){
            var m = (r+l)/2;

            if(nums[m]==target){
                return m;
            }
            // left sorted portion
            if(nums[l]<=nums[m]){
                // target in left portion
                if(nums[m]<target){
                    // search right
                    l = m +1;
                }else if(target < nums[l]){
                    // search right
                    l = m +1;
                }else{
                    r = m-1;
                }
        }else{
            // right sorted portion
            if(target < nums[m]){
                // search left
                r = m-1;

            }else if (target > nums[r] ){
                // search left
                r = m-1;
            }else{
                l = m+1;
            }
        }
        }
        return -1;
    }
}
