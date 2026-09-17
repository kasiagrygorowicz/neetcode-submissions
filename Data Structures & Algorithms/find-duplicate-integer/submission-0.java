class Solution {
    public int findDuplicate(int[] nums) {
        var n = nums.length-1;
        var counts = new int[n];
        for( int number : nums){
            if(counts[number-1]==1){
                return number;
            }
            counts[number-1] = 1;
        }
        return -1;
    }
}
