class Solution {
    public boolean hasDuplicate(int[] nums) {
        var length = nums.length;
        for(int i =0;i<length-1;i++){
            for(int j = i+1; j<length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}