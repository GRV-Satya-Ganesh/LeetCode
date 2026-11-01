class Solution {
    public int minMoves(int[] nums) {
        // incrementing the n-1 element = decrementing the that one element
        // so have to decrement all the elements until the all are equal to minimum element

        Arrays.sort(nums);

        int n = nums.length;
        int moves = 0;
        for(int i = n-1; i > 0; i--){
            if(nums[i] == nums[0]) break;
            moves += (nums[i] - nums[0]);
        }

        return moves;
    }
}