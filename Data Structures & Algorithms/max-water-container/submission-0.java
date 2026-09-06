class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;

        var left =0;
        var right = heights.length-1;
        while(left<right){
            var a = (right - left ) * Math.min(heights[left], heights[right]);
            if(a> maxArea){
                maxArea= a;
            }
            if(heights[left]< heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
