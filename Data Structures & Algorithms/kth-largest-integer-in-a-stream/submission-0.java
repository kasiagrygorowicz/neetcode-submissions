class KthLargest {
    private int k;
    private PriorityQueue<Integer> queue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<Integer>();
        for(int elem : nums){
            queue.offer(elem);
            if(queue.size()>k){
                queue.poll();
            }
        }

    }
    
    public int add(int val) {
        queue.offer(val);
        if(queue.size()>k){
            queue.poll();
        }
        return queue.peek();
    }
}
