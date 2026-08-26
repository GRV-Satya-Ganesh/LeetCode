class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        HashMap<Character, Integer> hmap = new HashMap<>();
        int left = 0;
        int len = 0;
        int maxLen = 0;

        for(int right = 0; right < n; right++){
            char curr = s.charAt(right);

            if(hmap.containsKey(curr)){
                int idx = hmap.get(curr);
                for(int i = left; i <= idx; i++) hmap.remove(s.charAt(i)); // removing from hmap
                len = hmap.size();
                left = idx + 1; // start from the duplicate next position
            }

            hmap.put(curr, right);
            len++;

            maxLen = (maxLen < len) ? len : maxLen;
        }

        return maxLen;
    }
}