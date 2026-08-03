class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int writer = 0; 
        int reader = 0;

        while(reader < n){
            if(nums[reader] != 0){
                int temp = nums[reader];
                nums[reader] = nums[writer];
                nums[writer] = temp;

                writer++;
            }
            reader++;
        }
    }
}