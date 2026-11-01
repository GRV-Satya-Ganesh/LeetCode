class Solution {
    public int[] productExceptSelf(int[] nums) {
        // brute force - take left_prod array and right_prod array and then multiply both and return the answer

        // optimal :
        int n = nums.length;
        int[] result = new int[n];

        int left_prod = 1;
        for(int i = 0; i < n; i++){
            result[i] = left_prod;
            left_prod *= nums[i];
        }

        int right_prod = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            result[i] = right_prod*result[i];
            right_prod *= nums[i];
        }

        return result;
    }
}