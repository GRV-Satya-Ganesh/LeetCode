class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int i = 0;
        while(i < n){
            int j = i+1;
            int k = n-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else{
                    result.add(List.of(nums[i], nums[j], nums[k]));

                    int num2Prev = nums[j];
                    while(j < n && nums[j] == num2Prev) j++;

                    int num3Prev = nums[k];
                    while(k >= 0 && nums[k] == num3Prev) k--;
                } 
            }

            int num1Prev = nums[i];
            while(i < n && nums[i] == num1Prev) i++;
        }

        return result;
    }
}