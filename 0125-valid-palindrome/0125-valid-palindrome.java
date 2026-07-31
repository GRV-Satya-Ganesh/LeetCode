class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int len = s.length();
        int l = 0;
        int r = len-1;

        while(l < r){
            char lChar = s.charAt(l);
            char rChar = s.charAt(r);

            while(l < len && !(Character.isLetterOrDigit(s.charAt(l)))) l++;

            while(r >= 0 && !(Character.isLetterOrDigit(s.charAt(r)))) r--;

            if(l < len && r >= 0){
                rChar = s.charAt(r);
                lChar = s.charAt(l);
            }
            else break;

            if(lChar != rChar) return false;

            l++;
            r--;
        }

        return true;
    }
}