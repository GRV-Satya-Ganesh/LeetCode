class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean isRow = false;
        boolean isCol = false;

        // Checking if first column contains 0
        for(int i = 0; i < n; i++){
            if(matrix[i][0] == 0){
                isCol = true;
                break;
            } 
        }

        // Checking if first row contains 0
        for(int i = 0; i < m; i++){
            if(matrix[0][i] == 0){
                isRow = true;
                break;
            } 
        }

        // making the first row and column as the indicators for each row and column respectively
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // checking 0 in first column means converting rows into 0's
        for(int i = 1; i < n; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < m; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        // checking 0 in first row means converting columns into 0's
        for(int i = 1; i < m; i++){
            if(matrix[0][i] == 0){
                for(int j = 1; j < n; j++){
                    matrix[j][i] = 0;
                }
            }
        }

        // checking if first row actually contains 0, if yes them filling first row with 0
        if(isRow){
            for(int i = 0; i < m; i++) matrix[0][i] = 0;
        }
        // checking if first column actually contains 0, if yes them filling first column with 0
        if(isCol){
            for(int i = 0; i < n; i++) matrix[i][0] = 0;
        }
    }
}