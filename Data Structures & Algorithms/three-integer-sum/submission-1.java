class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0; i<nums.length-2;i++){
            if(i> 0 && nums[i-1]==nums[i]) continue;

            var left = i+1;
            var right = nums.length-1;
            while(left<right){
                var dif = nums[i]+nums[left]+nums[right];
                if(dif == 0){
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left],nums[right])));
                    right--;
                    left++;
                    while(left<right && nums[left-1]==nums[left]){
                        left++;
                    }
                }
                else if(dif > 0){
                    right--;
                } else{
                    left++;
                }
            }
        }
        return result;



    }
}
