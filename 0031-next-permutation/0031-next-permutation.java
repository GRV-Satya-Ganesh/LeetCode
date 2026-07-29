class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // 1. Find the suitable prefix upto breaking point => nums[i] < nums[i+1]
        int brPoint = -1; // -1 can indicate whether the br point exists or not
        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                brPoint = i;
                break;
            }
        }

        // 2. replace the breaking point num with the num which is greater then the brPoint num and min among the suffix part
        if(brPoint > -1){ // if br point is -1 means, nums is the last permutation
        // since already sorted in descending iterate through last.
            for(int i = n-1 ; i > brPoint; i-- ){
                if(nums[i] > nums[brPoint]){
                    int temp = nums[brPoint];
                    nums[brPoint] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }

        // 3. Sort the suffix sub-array in the ascending order
        int l = brPoint + 1;
        int r = n-1;
        // since already sorted in the descending order just reverse them
        while(l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            l++;
            r--;
        }
    }
}