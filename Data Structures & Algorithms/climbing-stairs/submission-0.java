class Solution {
    public int climbStairs(int n) {
        var prev1 = 1;
        var prev2 = 1;
        var res = 1;
        for(int i =2; i<=n;i++){
            res = prev1 + prev2;
            prev1=prev2;
            prev2 = res;
        }

        return res;
    }
}
