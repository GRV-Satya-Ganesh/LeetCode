class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        HashSet<List<Integer>> triplets = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            HashSet<Integer> elements = new HashSet<>();
            for(int j = i+1; j < n; j++){
                int target = -(nums[i] + nums[j]);
                if(elements.contains(target)){
                    triplets.add(Arrays.asList(nums[i], target, nums[j]));
                }
                elements.add(nums[j]);
            }
        }

        return new ArrayList<>(triplets);
    }
}