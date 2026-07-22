class Solution {
    public int scoreOfString(String s) {
        int len = s.length();
        int result = 0;

        for(int i = 0; i < len-1; i++){
            result += Math.abs(s.charAt(i) - s.charAt(i+1));
        }

        return result;
    }
}