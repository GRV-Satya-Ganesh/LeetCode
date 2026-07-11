class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();

        if (len <= 1) return s;

        StringBuilder maxStr = new StringBuilder();
        int maxLen = 0;

        for (int i = 0; i < len; i++) {

            StringBuilder oddStr = checkPalindrome(s, i, i, len);
            if (oddStr.length() > maxLen) {
                maxStr.setLength(0);
                maxStr.append(oddStr);
                maxLen = oddStr.length();
            }

            StringBuilder evenStr = checkPalindrome(s, i, i + 1, len);
            if (evenStr.length() > maxLen) {
                maxStr.setLength(0);
                maxStr.append(evenStr);
                maxLen = evenStr.length();
            }
        }

        return maxStr.toString();
    }

    private StringBuilder checkPalindrome(String s, int l, int r, int len) {

        while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return new StringBuilder(s.substring(l + 1, r));
    }
}