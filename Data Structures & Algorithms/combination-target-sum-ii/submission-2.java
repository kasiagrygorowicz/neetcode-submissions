class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        var res = new ArrayList<List<Integer>>();
        dfs(candidates, res, new ArrayList<Integer>(), 0, target);
        return res;
    }

    private void dfs(int[] candidates, List<List<Integer>> res, List<Integer> sub, int i, int target) {

        if (i >= candidates.length) {
            return;
        }

        if (target == 0) return;

        if (candidates[i] > target) return;   // sorted, so nothing from here on can fit

        sub.add(candidates[i]);
        if (target - candidates[i] == 0) {
            res.add(new ArrayList<>(sub));
        }

        dfs(candidates, res, new ArrayList<>(sub), i + 1, target - candidates[i]);
        sub.remove(sub.size() - 1);

        int next = i + 1;
        while (next < candidates.length && candidates[next] == candidates[i]) {
            next++;
        }
        dfs(candidates, res, new ArrayList<>(sub), next, target);
    }
}