class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int i = 0;

        while(i < n){
            int j = i+1;
            while(j < n){

                int k = j+1;
                int l = n-1;

                while(k < l){
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if(sum < target) k++;
                    else if(sum > target) l--;
                    else{
                        result.add(List.of(nums[i], nums[j], nums[k], nums[l]));

                        int kPrev = nums[k];
                        while(k < l && nums[k] == kPrev) k++;

                        int lPrev = nums[l];
                        while(k < l && nums[l] == lPrev) l--;
                    }

                }

                int jPrev = nums[j];
                while(j < n && nums[j] == jPrev) j++;
            }

            int iPrev = nums[i];
            while(i < n && nums[i] == iPrev) i++;
        }

        return result;
    }
}