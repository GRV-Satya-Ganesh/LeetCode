class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;

        while(left < right){
            int mid = left + (right - left + 1)/2;

            if(mid % 2 != 0) mid--;

            // single can be present in the left part
            if(nums[mid] != nums[mid+1]){
                right = mid;
            }
            // single can be present in the right part
            else{
                left = mid+2;
            }
        }

        return nums[left];
    }
}