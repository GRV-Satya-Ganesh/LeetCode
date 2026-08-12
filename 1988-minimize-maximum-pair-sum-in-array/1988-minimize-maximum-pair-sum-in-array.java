class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        int maxSum = 0;
        Arrays.sort(nums);

        int i = 0;
        int j = n-1;

        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum > maxSum) maxSum = sum;
            i++;
            j--;
        }

        return maxSum;
    }
}