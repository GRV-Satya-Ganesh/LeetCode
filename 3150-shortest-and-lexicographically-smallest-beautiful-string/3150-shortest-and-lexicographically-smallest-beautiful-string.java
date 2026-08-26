class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();

        int ones = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        String result = "";

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);

            if(c == '1') ones++;

            if(ones == k){
                while(left < i && s.charAt(left) == '0') left++;
                String arb = s.substring(left, i+1);
                int len = arb.length();
                if(len < minLen){
                    result = arb;
                    minLen = len;
                }
                else if(len == minLen){
                    result = lexiOrder(result, arb, len);
                }

                ones--;
                left++;
            }
        }

        return result;
    }

    private String lexiOrder(String result, String arb, int len){
        for(int i = 0; i < len; i++){
            int a = arb.charAt(i) - '0';
            int r = result.charAt(i) - '0';
            if(a < r) return arb;
            else if(r < a) return result;
        }

        return result;
    }
}