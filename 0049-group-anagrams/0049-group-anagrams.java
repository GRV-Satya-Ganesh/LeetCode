class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        
        for(String str: strs){

            int n = str.length();
            int[] freqArray = new int[26];
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < n; i++) freqArray[str.charAt(i) - 'a'] += 1;

            for(int i = 0; i < 26; i++) sb.append(freqArray[i]).append("#");

            String key = sb.toString();

            if(mp.containsKey(key)) mp.get(key).add(str);
            else mp.put(key, new ArrayList<>(Arrays.asList(str)));
        }

        for(String key : mp.keySet()){
            result.add(mp.get(key));
        }

        return result;
    }
}