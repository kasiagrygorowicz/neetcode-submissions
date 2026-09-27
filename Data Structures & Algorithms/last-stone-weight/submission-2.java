class Solution {
    public int lastStoneWeight(int[] stones) {
        var maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int elem : stones){
            maxHeap.offer(elem);
        }

        while(maxHeap.size()>1){
            var x = maxHeap.poll();
            var y = maxHeap.poll();
            smash(x,y,maxHeap);
        }

        return maxHeap.peek() != null ? maxHeap.peek() : 0;

    }


    private void smash(int x, int y, PriorityQueue<Integer> maxHeap){
         if (x > y){
                maxHeap.offer(Integer.valueOf(x-y));
            }
    }
}
