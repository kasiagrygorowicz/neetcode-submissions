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
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals == null | intervals.isEmpty()) return true;
            intervals.sort((a,b)->a.start-b.start);
            var counter =0;
            int end = 0;
            for(Interval interval :  intervals){

                if(end > interval.start){
                    return false;
                }
                if(end <= interval.start){
                    end = interval.end;
                }

            }

            return true;

    }
}
