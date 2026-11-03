class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int num : nums){
            max = (num > max) ? num : max;
            sum += num;
        }

        return (max*n) - sum; // (sum of array containing only max) - (actual sum) = difference for the whole array
    }
}