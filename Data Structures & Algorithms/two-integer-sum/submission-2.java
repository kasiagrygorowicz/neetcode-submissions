class Solution {
    public int[] twoSum(int[] nums, int target) {
        var ns = new HashMap<Integer, Integer>();
        for(int i =0; i<nums.length;i++){
            var neededValue= target - nums[i];
            if(!ns.containsKey(neededValue)){
                ns.put(nums[i], i);
            }else{
                var result =new int[]{i, ns.get(neededValue)};
                Arrays.sort(result);
                return result;
            }
        }
        return new int[]{};
    }
}
