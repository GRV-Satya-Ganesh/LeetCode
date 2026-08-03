class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int freqArr[] = new int[n+1];

        for(int i = 0; i < n; i++){
            int num = nums[i];
            freqArr[num] += 1;
            if(freqArr[num] > 1) return num;
        }

        return 0;
    }
}