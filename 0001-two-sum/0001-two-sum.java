class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0; i < n; i++){
            int num = nums[i];

            if(hmap.containsKey(target-num))
                return new int[] {hmap.get(target-num), i};
            else 
                hmap.put(num, i);
        }

        return new int[] {-1, -1};
    }
}