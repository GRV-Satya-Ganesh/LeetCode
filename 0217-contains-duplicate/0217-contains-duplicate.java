class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hset = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(!hset.add(nums[i])) return true;
        }

        return false;
    }
}