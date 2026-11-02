class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>(); // to add the same anagram in their correspponding list

        for(String word : strs){
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);

            String key = new String(wordArr);
            
            if(!hmap.containsKey(key))
                hmap.put(key, new ArrayList<>());

            hmap.get(key).add(word);
        }

        return new ArrayList<>(hmap.values());
    }
}