class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] rowMaxHeight = new int[n];
        int[] colMaxHeight = new int[n];

        int ans = 0;

        for(int i = 0; i < n; i++){

            int rowMax = -1;
            int colMax = -1;

            for(int j = 0; j < n; j++){
                rowMax = (rowMax < grid[i][j]) ? grid[i][j] : rowMax;
                colMax = (colMax < grid[j][i]) ? grid[j][i] : colMax;
            }

            rowMaxHeight[i] = rowMax;
            colMaxHeight[i] = colMax;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans += (Math.min(rowMaxHeight[i], colMaxHeight[j]) - grid[i][j]);
            }
        }

        return ans;
    }
}
