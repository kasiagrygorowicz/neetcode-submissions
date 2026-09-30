class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        var res = new ArrayList<List<Integer>>();

        var subset = new ArrayList<Integer>();
        int i =0;
        dfs(nums, subset, i, res);
        return res;
    }

    private void dfs(int[] nums, List<Integer> subset, int i, List<List<Integer>> res ){
        if(i>= nums.length){
                res.add(subset);
                return;
        }

        // add
        subset.add(nums[i]);
        dfs(nums, new ArrayList<>(subset), i+1, res);

        //  not add
        subset.remove(subset.size()-1);
        dfs(nums, new ArrayList<>(subset), i+1, res);

    }
}
