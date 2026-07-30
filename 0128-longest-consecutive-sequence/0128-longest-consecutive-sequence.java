class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        HashSet<Integer> hset = new HashSet<>();
        int len = 1;
        int maxLen = 1;

        for(int i = 0; i < n; i++) hset.add(nums[i]);

        for(int num: hset){

            if(hset.contains(num-1)) continue;

            while(hset.contains(num+1)){
                num++;
                len++;
            }
            maxLen = (maxLen < len) ? len : maxLen;
            len = 1;
        }

        return maxLen;
    }
}