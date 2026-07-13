class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> result = new ArrayList<>();

        for(String word : words){
            char[] pMapArray = new char[26];
            char[] wMapArray = new char[26];

            boolean isValid = true;

            for(int i = 0; i < word.length(); i++){
                char pChar = pattern.charAt(i);
                char wChar = word.charAt(i);

                if(wMapArray[wChar - 'a'] == '\0'){
                    if(pMapArray[pChar - 'a'] != '\0'){
                        isValid = false;
                        break;
                    }

                    wMapArray[wChar - 'a'] = pChar;
                    pMapArray[pChar - 'a'] = wChar;
                }
                else if(wMapArray[wChar - 'a'] != pChar){
                    isValid = false;
                    break;
                }

            }

            if(isValid) result.add(word);
        }

        return result;
    }
}