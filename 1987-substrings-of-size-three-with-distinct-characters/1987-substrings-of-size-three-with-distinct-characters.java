class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int k = 3;
        int count = 0;

        int left = 0;
        int distinct = 0;
        int freq[] = new int[26];

        for(int right = 0; right < n; right++){
            char c = s.charAt(right);

            if(freq[c - 'a'] == 0) distinct++;

            freq[c-'a'] += 1;

            if(right-left+1 > k){
                int remove = s.charAt(left)-'a';
                freq[remove] -= 1;
                if(freq[remove] == 0) distinct--;

                left++;
            }

            if(distinct == k && right-left+1 == k) count++;
        }

        return count;
    }
}