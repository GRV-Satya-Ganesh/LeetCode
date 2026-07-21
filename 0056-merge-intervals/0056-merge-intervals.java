class Solution {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));

        int i = 0;
        while(i < n){
            if(result.isEmpty() || result.get(result.size() - 1).get(1) < intervals[i][0]){
                result.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
            else{
                int end1 = result.get(result.size() - 1).get(1);
                end1 = Math.max(end1, intervals[i][1]);

                result.get(result.size() - 1).set(1, end1);
            }
            i++;
        }


        int r = result.size();

        int[][] ans = new int[r][2];
        for(i = 0; i < r; i++){
            ans[i][0] = result.get(i).get(0);
            ans[i][1] = result.get(i).get(1);
        }

        return ans;
    }
}