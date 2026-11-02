class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int medianPos = (n+1)/2;
        int medianIndex = medianPos - 1;
        int median = nums[medianIndex];

        int moves = 0;
        for(int num : nums) moves += Math.abs(median - num);

        return moves;
    }
}