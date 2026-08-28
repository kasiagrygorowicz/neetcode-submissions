class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first = -1;
        int second = -1;
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j< nums.length;j++){
                if(nums[i]+nums[j] == target){
                    first = i;
                    second = j;
                }
            }
        }
        int[] a = {first,second};
        // Arrays.sort(a);
        return a;
    }
}
