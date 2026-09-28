/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int[] start = new int[intervals.size()];
        int[] end = new int[intervals.size()];

        for(int i=0; i<intervals.size();i++){
            var tmp = intervals.get(i);
            start[i] = tmp.start;
            end[i] = tmp.end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int res =0, counter =0;
        int s=0, e=0;

        while(s<intervals.size() && e <intervals.size()){
            if(start[s]<end[e]){
                counter++;
                s++;
            }else{
                counter--;
                e++;
            }
            res = Math.max(res, counter);
        }

        return res;




    }
}
