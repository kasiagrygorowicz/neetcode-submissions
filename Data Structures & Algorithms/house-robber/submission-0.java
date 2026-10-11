class Solution {
    public int rob(int[] nums) {
        var h1sum = 0;
        var h2sum = 0;

        if(nums.length ==0 ) return 0;
        if(nums.length == 1) return nums[0];


        for(int n : nums){
            var tmp = Math.max(n + h1sum, h2sum);
            h1sum = h2sum;
            h2sum = tmp;
        }

        return h2sum;
    }
}
