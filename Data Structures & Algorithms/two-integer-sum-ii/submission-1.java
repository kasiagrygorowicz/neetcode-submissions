class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        while(left<right){
            var r = numbers[left]+ numbers[right] - target;
            if(r == 0){
                return new int[]{left+1,right+1};
            }else if(r > 0){
                right--;
            }else{
            left++;
            }
        }
        return new int[2];
    }
}
