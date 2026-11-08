class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        int[][] visited = new int[m][n]; // to check while calculating the cols (some maybe visited)
        
        // checking rows
        for(int i = 0; i < m; i++){
            int rowCount = 0;
            int[] rowVisited = new int[n];
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    rowVisited[j] = 1;
                    rowCount++;
                } 
            }

            if(rowCount > 1){
                for(int j = 0; j < n; j++) visited[i][j] = rowVisited[j];
                count += rowCount;
            }
        }

        // checking the columns
        for(int j = 0; j < n; j++){
            int colCount = 0;
            int visitedCount = 0;
            for(int i = 0; i < m; i++){
                if(grid[i][j] == 1){
                    if(visited[i][j] == 1) visitedCount++;
                    colCount++;
                }
            }

            if(colCount > 1){
                count += (colCount - visitedCount);
            }
        }

        return count;
    }
}