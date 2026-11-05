class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        // rejecting condition -> |arr1[i]-arr2[j]| <= d
        // range becomes -> if element in arr2 (y) lies between [x-d, x+d] -> arr1[i] (x) will be rejected

        int count = 0;
        Arrays.sort(arr2);

        for(int num : arr1){
            int lowerBound = num - d;
            int upperBound = num + d;

            int low = 0; 
            int high = arr2.length;
            while(low < high){
                int mid = (high - low)/2 + low;

                if(arr2[mid] < lowerBound) low = mid+1;
                else high = mid;
            }

            if(low == arr2.length || arr2[low] > upperBound) count++;
        }

        return count;
    }
}