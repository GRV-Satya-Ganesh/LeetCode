class Solution {
    public boolean backspaceCompare(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        StringBuilder sb1 = new StringBuilder();
        int n = 0;

        StringBuilder sb2 = new StringBuilder();
        int m = 0;

        for(int i = 0; i < len1; i++){
            char c = s.charAt(i);
            if(c == '#'){
                if(n == 0) continue;
                sb1.deleteCharAt(n-1);
                n--;
                continue;
            }

            sb1.append(c);
            n++;
        }

        for(int i = 0; i < len2; i++){
            char c = t.charAt(i);
            if(c == '#'){
                if(m == 0) continue;
                sb2.deleteCharAt(m-1);
                m--;
                continue;
            }

            sb2.append(c);
            m++;
        }

        System.out.println(sb1);
        System.out.println(sb2);

        return sb1.toString().equals(sb2.toString());
    }
}