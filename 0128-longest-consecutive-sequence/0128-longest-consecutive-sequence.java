class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int len = 1;
        int maxLen = 1;

        Arrays.sort(nums);

        for(int i = 0; i < n-1; i++){
            int curr = nums[i];
            int next = nums[i+1];


            if(curr == next) continue;
            else if(next == curr+1) len++;
            else len = 1;

            maxLen = (maxLen < len) ? len : maxLen;
        }

        return maxLen;
    }
}