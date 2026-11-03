class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);

        int maxLen = 0;

        for(int num : set){
            if(set.contains(num-1)) continue; // we are counting the length from the sequence starting

            int len = 1;
            int x = num;

            while(set.contains(x+1)){
                x++;
                len++;
            }
            maxLen = (maxLen < len) ? len : maxLen;
        }

        return maxLen;
    }
}