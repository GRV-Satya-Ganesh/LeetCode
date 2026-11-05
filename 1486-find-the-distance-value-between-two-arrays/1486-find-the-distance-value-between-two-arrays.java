class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int dist = 0;

        // satisfy condition -> |arr1[i]-arr2[j]| > d

        for(int n : arr1){
            boolean isValid = true;
            for(int m : arr2){
                if(Math.abs(n-m) <= d){
                    isValid = false;
                    break;
                }
            }

            if(isValid) dist++;
        }

        return dist;
    }
}