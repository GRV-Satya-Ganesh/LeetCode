class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int maxSum = Integer.MIN_VALUE;
        int runningSum = 0;

        for(int i = 0; i < n; i++){
            runningSum += nums[i];

            maxSum = (maxSum < runningSum) ? runningSum : maxSum;

            if(runningSum < 0) runningSum = 0;
        }

        return maxSum;
    }
}