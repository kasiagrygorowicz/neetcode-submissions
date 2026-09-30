class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        var res = new ArrayList<List<Integer>>();
        
    
        dfs(nums, res, new ArrayList<>(), 0, target,0);
        
        return res;


    }

    private void dfs(int[] nums, List<List<Integer>> res, List<Integer> subset, int partialSum, int target, int i){
      if(i>= nums.length){
        return;
      }

    //   try to add i-th value again
    subset.add(nums[i]);
    if(partialSum + nums[i] == target){
        res.add(new ArrayList<>(subset));
    } else if(partialSum + nums[i] < target){
        dfs(nums,res,new ArrayList<>(subset),partialSum + nums[i],target,i);
    }

    subset.remove(subset.size()-1);


    // try to add next value
    dfs(nums,res,new ArrayList<>(subset),partialSum,target,i+1);



       
    }
}
