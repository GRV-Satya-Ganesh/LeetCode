class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] result = new int[2];

        for(int i = 0; i < n; i++){
            int num = numbers[i];

            int lFound = binarySearch(numbers, target-num, 0, i-1);
            int rFound = binarySearch(numbers, target-num, i+1, n-1);

            if(lFound > -1){
                result[0] = lFound+1;
                result[1] = i+1;
                break;
            }
            else if(rFound > -1){
                result[0] = i+1;
                result[1] = rFound+1;
                break;
            }
        }

        return result;
    }

    private int binarySearch(int[] nums, int target, int start, int end){
        int low = start;
        int high = end;

        while(low <= high){
            int mid = low + (high - low + 1)/2;
            int num = nums[mid];

            if(num == target) return mid;
            else if(num < target) low = mid + 1;
            else if(num > target) high = mid - 1;
        }

        return -1;
    }
} 