class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int len1 = word1.length();
        int len2 = word2.length();

        if(len1 == 0) return word2;
        else if(len2 == 0) return word1;
        else{
            int i = 0;
            int j = 0;
            while(i < len1 && j < len2){
                char c1 = word1.charAt(i);
                char c2 = word2.charAt(j);

                sb.append(c1);
                sb.append(c2);

                i++;
                j++;
            }
            if(i >= len1 && j >= len2) return sb.toString();
            else if(i >= len1){
                while(j < len2){
                    char c = word2.charAt(j);
                    sb.append(c);
                    j++;
                }
            }
            else if(j >= len2){
                while(i < len1){
                    char c = word1.charAt(i);
                    sb.append(c);
                    i++;
                }
            }
        }

        return sb.toString();
    }
}