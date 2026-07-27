class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < n ; i++){
            int num = nums[i];

            if(mp.containsKey(target - num)){
                result[0] = mp.get(target - num);
                result[1] = i;
            }
            else mp.put(num, i);
        }

        return result;
    }
}