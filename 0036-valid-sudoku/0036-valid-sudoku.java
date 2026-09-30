class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;

        for(int i = 0; i < n; i++){
            HashSet<Character> hset = new HashSet<>();
            for(int j = 0; j < n; j++){
                char c = board[i][j];
                if(!Character.isDigit(c)) continue;
                if(!hset.add(c)) return false;
            }
        }

        for(int i = 0; i < n; i++){
            HashSet<Character> hset = new HashSet<>();
            for(int j = 0; j < n; j++){
                char c = board[j][i];
                if(!Character.isDigit(c)) continue;
                if(!hset.add(c)){
                    return false;
                }
            }
        }

        HashSet<Character> hset1 = new HashSet<>();
        HashSet<Character> hset2 = new HashSet<>();
        HashSet<Character> hset3 = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int col = j/3;
                char c = board[i][j];
                if(!Character.isDigit(c)) continue;

                if(col == 0){
                    if(!hset1.add(c)) return false;
                }
                else if(col == 1){
                    if(!hset2.add(c)) return false;
                }
                else if(col == 2){
                    if(!hset3.add(c)) return false;
                }
            }
            if(i % 3 == 2){
                hset1.clear();
                hset2.clear();
                hset3.clear();
            }
        }

        return true;
    }
}