class Solution {
    public int rob(int[] nums) {

        return Math.max(nums[0], Math.max(max(Arrays.copyOfRange(nums, 0, nums.length-1)),max(Arrays.copyOfRange(nums,1, nums.length))));
    }

    private int max(int[] nums){
    var h1 =0;
        var h2 = 0;
    
        for(int n :nums){
            var tmp =  Math.max(h1+n, h2);
            h1 = h2;
            h2 = tmp;
        }

        return h2;
    }
}
