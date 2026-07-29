class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int r; // helper - stores the row of the target

        int high = n-1;
        int low = 0;
        int mid = 0;

        while(low <= high){
            mid = low + ((high - low) + 1)/2;
            int num = matrix[mid][0];

            if(num == target){
                break;
            }
            else if(num < target){
                low = mid+1;
            }
            else if(num > target){
                high = mid-1;
            }

            if(low < n && high >= 0 && low > high) mid = (matrix[high][0] <= target) ? high : low;
        }

        if(matrix[mid][0] == target) return true;
        else r = mid;


        high = m-1;
        low = 0;
        while(low <= high){
            mid = low + ((high - low) + 1) /2;
            int num = matrix[r][mid];

            if(num == target){
                break;
            }
            else if(num < target){
                low = mid+1;
            }
            else if(num > target){
                high = mid-1;
            }
        }

        if(matrix[r][mid] == target) return true;

        return false;
    }
}