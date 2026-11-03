class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> lst = new ArrayList<>(hmap.entrySet());
        lst.sort((a,b) -> 
            Integer.compare(b.getValue(), a.getValue())
        );

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = lst.get(i).getKey();
        }

        return result;
    }
}