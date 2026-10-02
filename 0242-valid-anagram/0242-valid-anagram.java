class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        int[] sFreq = new int[26];
        for(int i = 0; i < n; i++) sFreq[s.charAt(i)-'a']++;

        for(int i = 0; i < n; i++){
            char ch = t.charAt(i);
            if(sFreq[ch-'a'] < 1) return false;
            else sFreq[ch-'a']--;
        }

        return true;
    }
}