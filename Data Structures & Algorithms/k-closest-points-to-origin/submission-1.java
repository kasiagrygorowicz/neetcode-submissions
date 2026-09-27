class Solution {
    public int[][] kClosest(int[][] points, int k) {
        var minHeap = new PriorityQueue<int[]>(Comparator.comparing(a->a[0]));
        for(int[] point : points){
            minHeap.offer(new int[]{point[0]*point[0]+point[1]*point[1], point[0], point[1]});
        }

        var result = new int[k][2];
        for(int i=0; i<k;i++){
            var p = minHeap.poll();
            result[i][0] = p[1];
            result[i][1] = p[2];
        }

        return result;

    }
}
