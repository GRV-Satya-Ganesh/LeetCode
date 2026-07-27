class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        
        for(String str: strs){

            char[] arr = str.toCharArray();

            Arrays.sort(arr);

            String key = new String(arr);

            if(mp.containsKey(key)) mp.get(key).add(str);
            else mp.put(key, new ArrayList<>(Arrays.asList(str)));
        }

        for(String key : mp.keySet()){
            result.add(mp.get(key));
        }

        return result;
    }
}