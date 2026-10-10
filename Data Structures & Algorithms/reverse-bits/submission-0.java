class Solution {
    public int reverseBits(int n) {
        var res = 0;
        for(int i =0; i< 32; i++){
            var bit = n >> i & 1;
            res = res | (bit << (31-i));
        }

        return res;
    }
}
