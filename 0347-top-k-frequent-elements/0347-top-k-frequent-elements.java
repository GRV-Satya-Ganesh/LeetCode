class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] result = new int[k];

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            int num = nums[i];
            
            if(mp.containsKey(num)){
                mp.replace(num, mp.get(num) + 1);
            }
            else mp.put(num, 1);
        }

        List<Integer>[] bucket = new ArrayList[n+1];

        for(int key : mp.keySet()){
            int freq = mp.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int count = 0;
        for(int i = n; i >= 1; i--){

            if(bucket[i] == null) continue;

            for(int j = 0; j < bucket[i].size(); j++){
                if(count == k) break;

                result[count] = bucket[i].get(j);
                count++;
            }
        }

        return result;
    }
}