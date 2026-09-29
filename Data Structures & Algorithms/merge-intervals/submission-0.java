class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        var result = new ArrayList<int[]>();
        var previousInterval = intervals[0];
        for(int i =1; i< intervals.length;i++){
            if(previousInterval[1]<intervals[i][0]){
                result.add(previousInterval);
                previousInterval = intervals[i];
            }else{
                previousInterval[0] = Math.min(intervals[i][0], previousInterval[0]);
                previousInterval[1] = Math.max(intervals[i][1], previousInterval[1]);
            }
        }
        if(previousInterval !=null) result.add(previousInterval);
        return result.toArray(new int[result.size()][]);
    }
}
