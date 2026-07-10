class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int len = s.length();

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i = len-1; i >= 0; i--){
            char c = s.charAt(i);

            if(c == '-') continue;
            
            if(c >= 97 && c <= 122) c -= 32;

            sb.append(c);
            count += 1;

            if(count == k && i != 0){
                sb.append('-');
                count = 0;
            } 
        }

        if(sb.length() > 0 && sb.charAt(sb.length()-1) == '-')
            sb.deleteCharAt(sb.length()-1);

        return sb.reverse().toString();
    }
}