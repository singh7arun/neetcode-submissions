class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = 0;

        while (i < matrix.length-1 && matrix[i+1][0] <= target){
            i++;
        }
        
        while (j < matrix[0].length && matrix[i][j] <= target){
            if (matrix[i][j] == target){
                return true;
            }
            j++;
        }
        return false;
    }

    public int getRowIndex(int[][] matrix, int target){
        int i = 0;

        while (i < matrix.length-1 && matrix[i+1][0] <= target){
            i++;
        }
        return i;
    }
}
