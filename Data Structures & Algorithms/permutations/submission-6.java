class Solution {
    public List<List<Integer>> permute(int[] nums) {
        var r = new ArrayList<List<Integer>>();
        perm(r, nums, 0);
        return r;


    }

    private void perm(List<List<Integer>> result, int[] nums, int index){
        if(index == nums.length){
            var perms = new ArrayList<Integer>();
            for(int num : nums) perms.add(num);
            result.add(perms);
            return;
        }

        for(int i = index; i< nums.length;i++){
            swap(nums, i, index);
            perm(result, nums, index + 1);
            swap(nums, i, index);

        }
    }

        private void swap(int[] nums, int i, int j){
            var tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    
}
