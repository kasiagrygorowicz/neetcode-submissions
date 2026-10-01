class Solution {
    public int maxSubArray(int[] nums) {
        var maxSub =nums[0];
       var curMax =0;
        for(int n : nums){
            if(curMax <0 ){
                curMax = 0;
            }

            curMax += n;
            maxSub = Math.max(curMax, maxSub);

        }

        return maxSub;
    }
}
