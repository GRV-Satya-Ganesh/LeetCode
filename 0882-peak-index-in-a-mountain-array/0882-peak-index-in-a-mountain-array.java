class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left < right){
            int mid = left + (right-left)/2;

            if(arr[mid] < arr[mid+1]){
                left = mid+1;
            }
            else if(arr[mid] > arr[mid+1]){ // mid can also be an answer
                right = mid;
            }
        }

        return left;
    }
}   