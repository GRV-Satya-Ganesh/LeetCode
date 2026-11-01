class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;

        HashSet<Character>[] boxes = new HashSet[9];
        for(int i = 0; i < n; i++){
            boxes[i] = new HashSet<>();
        }

        for(int i = 0; i < n; i++){
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();

            for(int j = 0; j < n; j++){
                char rowValue = board[i][j]; // row
                char colValue = board[j][i]; // col
                int boxIndex = (i / 3) * 3 + (j / 3);

                if(rowValue != '.' && (!rowSet.add(rowValue) || !boxes[boxIndex].add(rowValue)))
                    return false;

                if(colValue != '.' && !colSet.add(colValue))
                    return false;
            }
        }

        return true;
    }
}