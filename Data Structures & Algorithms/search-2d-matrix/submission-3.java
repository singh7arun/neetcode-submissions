class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = 0;
        boolean nextRow = false;
        while (i < matrix.length && matrix[i][j] <= target){
            if (matrix[i][j] == target){
                return true;
            }
            i++;
            nextRow = true;
        }
        if (nextRow) i--;
        while (j < matrix[0].length && matrix[i][j] <= target){
            if (matrix[i][j] == target){
                return true;
            }
            j++;
        }
        return false;
    }
}
