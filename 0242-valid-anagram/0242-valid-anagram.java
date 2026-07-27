class Solution {
    public boolean isAnagram(String s, String t) {

        int sLen = s.length();
        int tLen = t.length();
        int len;

        if(sLen != tLen) return false;
        else len = sLen;

        int sFreq[] = new int[26];
        int tFreq[] = new int[26];

        for(int i = 0; i < len; i++){
            char sChar = s.charAt(i);
            sFreq[sChar - 'a'] += 1;
        }

        for(int i = 0; i < len; i++){
            char tChar = t.charAt(i);
            tFreq[tChar - 'a'] += 1;

            if(tFreq[tChar - 'a'] > sFreq[tChar - 'a']) return false;
        }
        
        return true;
    }
}