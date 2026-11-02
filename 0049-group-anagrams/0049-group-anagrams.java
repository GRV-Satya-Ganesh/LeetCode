class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>(); // to add the same anagram in their correspponding list

        for(String word : strs){
            int[] freq = new int[26];

            for(int i = 0; i < word.length(); i++) freq[word.charAt(i) - 'a']++;

            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < 26; i++) sb.append(freq[i]).append("#");

            String key = sb.toString();

            if(hmap.containsKey(key))
                hmap.get(key).add(word);
            else{
                List<String> list = new ArrayList<>();
                list.add(word);
                hmap.put(key, list);
            }
        }

        List<List<String>> result = new ArrayList<>();
        hmap.forEach((key,value) -> {
            result.add(value);
        });

        return result;
    }
}