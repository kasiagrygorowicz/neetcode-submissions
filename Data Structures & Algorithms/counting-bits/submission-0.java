class Solution {
    public int[] countBits(int n) {
        var result = new int[n+1];
        for(int i =0; i<=n;i++){
            var res = 0;
            var num = i;
            while(num!=0){
                res+= num%2;
                num = num >> 1;
            }
            result[i] = res;
        }

        return result;
    }
}
