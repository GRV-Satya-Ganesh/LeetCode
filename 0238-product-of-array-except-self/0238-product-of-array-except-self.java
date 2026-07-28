class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int[] left = new int[n];
        int rightProduct = 1;

        for(int i = 0; i < n; i++){

            if(i == 0) left[i] = 1;
            else left[i] = nums[i-1] * left[i-1];

        }

        for(int i = n-1; i >= 0; i--){

            answer[i] = left[i]*rightProduct;
            rightProduct *= nums[i];

        }

        return answer;
    }
}