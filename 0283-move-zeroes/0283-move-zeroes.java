class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l = 0; 

        while(l < n){
            while(l < n && nums[l] != 0) l++;
            int r = l + 1;
            while(r < n && nums[r] == 0) r++;
            
            if(r >= n) break;

            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;   
        }
    }
}