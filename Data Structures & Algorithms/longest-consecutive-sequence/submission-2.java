class Solution {
    public int longestConsecutive(int[] nums) {
        var maxConsecutiveSequence =0;
        var set = new HashSet<Integer>();
        for(int n : nums){
            set.add(n);
        }

              for (int n : set) {
            if (!set.contains(n - 1)) {  // only start from sequence beginnings
                int nextValue = n;
                int counter = 1;
                while (set.contains(nextValue + 1)) {
                    nextValue++;
                    counter++;
                }
                maxConsecutiveSequence = Math.max(maxConsecutiveSequence, counter);
            }
        }
        return maxConsecutiveSequence;
    }
}
