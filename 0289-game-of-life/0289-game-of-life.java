class Solution {
    public void gameOfLife(int[][] board) {
        
        int n = board.length;
        int m = board[0].length;

        // 2 -> alive, -2 -> dead

        int[] dirX = {0, -1, -1, -1, 0, 1, 1, 1};
        int[] dirY = {-1, -1, 0, 1, 1, 1, 0, -1};

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                
                int aliveCount = 0;
                int cell = board[i][j];

                for(int k = 0; k < 8; k++){
                    int nx = i + dirX[k];
                    int ny = j + dirY[k];

                    if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                    int state = board[nx][ny];

                    if(state == 1 || state == -2) aliveCount++;
                }

                if(cell == 1 && (aliveCount > 3 || aliveCount < 2)) board[i][j] = -2;
                else if(cell == 0 && aliveCount == 3) board[i][j] = 2;

            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == -2) board[i][j] = 0;
                else if(board[i][j] == 2) board[i][j] = 1;
            }
        }
    }
}