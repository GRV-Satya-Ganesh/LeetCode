class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == target) continue;
            nums[i] = -1*target;
        }

        int count = 0;

        for(int i = 0; i < n; i++){
            long sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                if((target > 0 && sum > 0) || (target < 0 && sum < 0)) count++;
            }
        }

        return count;
    }
}