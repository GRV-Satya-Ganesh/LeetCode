class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");

        int n = arr.length;

        for(int i = 0; i < n; i++){

            char endChar = arr[i].charAt(arr[i].length() - 1);
            char startChar = arr[(i+1) % n].charAt(0);

            if(endChar != startChar) return false;

        }

        return true;
    }
}