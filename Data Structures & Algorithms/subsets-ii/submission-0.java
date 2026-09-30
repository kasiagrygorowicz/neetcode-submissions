class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        var res = new ArrayList<List<Integer>>();
        dfs(nums, 0, res, new ArrayList<Integer>());
        return res;
    }

    private void dfs(int[] nums, int i, List<List<Integer>> res, List<Integer> sub){
        
    
        if(i>= nums.length){
             res.add(new ArrayList<>(sub));
            return;
        }

    
        sub.add(nums[i]);
        dfs(nums,i+1,  res, new ArrayList<>(sub));
        sub.remove(sub.size()-1);
        
        while(i+1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }
         dfs(nums,i+1,  res, new ArrayList<>(sub));
    }
}
