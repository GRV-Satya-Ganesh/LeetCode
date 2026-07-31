class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int len = s.length();
        int l = 0;
        int r = len-1;

        while(l < r){
            
            while(l < len && !(Character.isLetterOrDigit(s.charAt(l)))) l++;

            while(r >= 0 && !(Character.isLetterOrDigit(s.charAt(r)))) r--;

            if(l < len && r >= 0){
                char rChar = s.charAt(r);
                char lChar = s.charAt(l);

                if(lChar != rChar) return false;
                
                l++;
                r--;
            }
            else break;

        }

        return true;
    }
}