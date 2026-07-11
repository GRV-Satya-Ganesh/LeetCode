class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i <= n-3; i++){
            HashSet<Integer> hs = new HashSet<>();

            for(int j = i+1; j < n; j++){
                int reqNum = -1*(nums[i] + nums[j]);

                if(hs.contains(reqNum)){

                    List<Integer> triplet = Arrays.asList(nums[i], reqNum, nums[j]);
                    Collections.sort(triplet);

                    if(!set.contains(triplet)){
                        set.add(triplet);
                    }
                }

                hs.add(nums[j]);
            }
        }

        return new ArrayList<>(set);
    }
}