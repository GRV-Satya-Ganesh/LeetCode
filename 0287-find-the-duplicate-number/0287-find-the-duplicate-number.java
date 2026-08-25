class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            int x = Math.abs(nums[i]);
            if(nums[x] < 0) return x;
            nums[x] *= -1;
        }

        return -1;
    }
}