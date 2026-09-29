class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int overlapCounter = 0;
        var prev =  intervals[0];
        for(int i =1; i< intervals.length;i++){
        
            if(intervals[i][0] < prev[1]){
                overlapCounter++;
            
            }else{
                prev = intervals[i];
            }
             
        }
        return overlapCounter;
    }
}
