class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l = 0; 
        int r = l+1;

        while(l < r){
            while(l < n && nums[l] != 0) l++;
            r = l + 1;
            while(r < n && nums[r] == 0) r++;
            
            if(r >= n) break;

            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;   
        }
    }
}