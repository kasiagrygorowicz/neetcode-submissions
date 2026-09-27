class Solution {
    public int findKthLargest(int[] nums, int k) {
        var minHeap = new PriorityQueue<Integer>();

        for(int n : nums){
            minHeap.offer(-n);
        }

        for(int i=1; i<k;i++){
            minHeap.poll();
        }

        return minHeap.peek()*(-1);
    }
}
