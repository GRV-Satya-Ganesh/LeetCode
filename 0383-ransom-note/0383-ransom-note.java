class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomFreq = new int[26];
        int[] magazineFreq = new int[26];

        int l1 = ransomNote.length();
        int l2 = magazine.length();

        for(int i = 0; i < l2; i++){
            char c = magazine.charAt(i);
            magazineFreq[c - 'a'] += 1;
        }

        for(int i = 0; i < l1; i++){
            char c = ransomNote.charAt(i);

            if(magazineFreq[c - 'a'] >= 1)
                magazineFreq[c - 'a'] -= 1;
            else return false;
        }

        return true;
    }
}