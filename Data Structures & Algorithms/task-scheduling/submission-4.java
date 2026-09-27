class Solution {
    public int leastInterval(char[] tasks, int n) {
       int[] counts = new int[26];
       for(char c : tasks){
        counts[c-'A']++;
       }


       var maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
       for(int c : counts){
        if(c>0){
            maxHeap.offer(c);
        }
       }
       int time =0;
       Queue<int[]> q = new LinkedList<>();
       while(!maxHeap.isEmpty() || !q.isEmpty()){
        time++;
        if(maxHeap.isEmpty()){
            time = q.peek()[1];
        }else{
            int cnt = maxHeap.poll()-1;
            if(cnt >0){
                q.add(new int[]{cnt, time+n});
            }
        }

        if(!q.isEmpty() && q.peek()[1]==time){
            maxHeap.add(q.poll()[0]);
        }
       }
       return time;

    }
}
