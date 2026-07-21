class Solution {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;

        List<List<Integer>> result = new ArrayList<>();
        int visited[] = new int[n];

        Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));

        for(int i = 0; i < n; i++){
            if(visited[i] == 1){
                continue;
            } 

            int start = intervals[i][0];
            int end = intervals[i][1];

            int j = i+1;
            while(j < n && intervals[j][0] <= end){
                end = Math.max(end, intervals[j][1]);
                visited[j] = 1;
                j++;
            }
            
            result.add(List.of(start, end));
            visited[i] = 1;
        }


        int r = result.size();

        int[][] ans = new int[r][2];
        for(int i = 0; i < r; i++){
            ans[i][0] = result.get(i).get(0);
            ans[i][1] = result.get(i).get(1);
        }

        return ans;
    }
}