class Solution {
    public int minMoves(int[] nums) {
        // incrementing the n-1 element = decrementing the that one element
        // so have to decrement all the elements until the all are equal to minimum element
        int min = Integer.MAX_VALUE;
        for(int num : nums) min = (min > num) ? num : min;

        int moves = 0;
        for(int num : nums) moves += num - min;

        return moves;
    }
}