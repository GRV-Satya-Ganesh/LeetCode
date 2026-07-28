class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int rightProduct = 1;

        answer[0] = 1;
        for(int i = 1; i < n; i++) answer[i] = nums[i-1]*answer[i-1];

        for(int i = n-2; i >= 0; i--){
            rightProduct *= nums[i+1];
            answer[i] = answer[i]*rightProduct;
        }

        return answer;
    }
}