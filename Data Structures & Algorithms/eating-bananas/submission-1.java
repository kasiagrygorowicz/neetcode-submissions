class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        var max = Arrays.stream(piles).max().getAsInt();

        var kMin = 1;
        var kMax = max;
        var result=Integer.MAX_VALUE;
        while(kMin<=kMax){
            var mid = (kMax + kMin)/2;
            var hoursNeeded=0;
            for(int p :piles){
                hoursNeeded+=Math.ceil((double)p/mid);
            }

           if(hoursNeeded >h){
                kMin = mid +1;
            }else{
                if(result>mid){
                result = mid;
                }
               
               kMax = mid -1;
            }
        }
        return result;
    }
}
