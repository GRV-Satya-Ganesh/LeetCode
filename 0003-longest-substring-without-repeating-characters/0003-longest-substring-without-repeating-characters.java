class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> lastIndex = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            left = Math.max(left, lastIndex.getOrDefault(current, -1) + 1);

            lastIndex.put(current, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}