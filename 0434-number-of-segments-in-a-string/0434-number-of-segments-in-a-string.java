class Solution {
    public int countSegments(String s) {
        int len = s.length();
        boolean isWord = false;
        int wordCount = 0;

        for(int i = 0; i < len; i++){
            if(s.charAt(i) == ' ') isWord = false;
            else{
                if(!isWord) wordCount++;
                isWord = true;
            }
        }

        return wordCount;
    }
}