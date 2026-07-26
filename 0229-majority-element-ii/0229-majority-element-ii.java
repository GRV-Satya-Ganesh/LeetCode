class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int reqCount = n/3;

        int ele1 = -1;
        int ele2 = -1;

        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < n; i++){
            int num = nums[i];

            if (num == ele1)
                count1++;
            else if (num == ele2)
                count2++;
            else if (count1 == 0) {
                ele1 = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                ele2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int num : nums){
            if(num == ele1) count1++;
            else if(num == ele2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if(count1 > reqCount) result.add(ele1);
        if(count2 > reqCount) result.add(ele2);

        return result;
    }
}