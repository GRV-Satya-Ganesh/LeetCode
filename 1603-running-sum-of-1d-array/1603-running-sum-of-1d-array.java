class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int runningSum = 0;

        for(int i = 0; i < n; i++){
            runningSum += nums[i];
            result[i] = runningSum;
        }

        return result;
    }
}