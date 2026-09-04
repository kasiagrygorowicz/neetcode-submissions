class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var counts = new HashMap<Integer, Integer>();
        for (int n : nums) {
            var num = counts.getOrDefault(n, 0);
            counts.put(n, num + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (buckets[entry.getValue()] == null) {
                buckets[entry.getValue()] = new ArrayList<>();
            }
            buckets[entry.getValue()].add(entry.getKey());
        }

        var result = new int[k];
        int index = 0;
        for (int freq = buckets.length - 1; freq >= 0 && index < k; freq--) {
            if (buckets[freq] == null) continue;
            for (int value : buckets[freq]) {
                result[index] = value;
                index++;
                if (index == k) break;
            }
        }
        return result;
    }
}