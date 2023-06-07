// 73. Set Matrix Zeroes

//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
// https://leetcode.com/problems/set-matrix-zeroes/description/


//Better solution, where we are initializing one row and col, where we are filling with -1, 
// if we found any 0 through out the row and col.

class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] dummyRow = new int[row];
        int[] dummyCol = new int[col];

        Arrays.fill(dummyRow, -1);
        Arrays.fill(dummyCol, -1);

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    dummyRow[i] = 0;
                    dummyCol[j] = 0;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dummyRow[i] == 0 || dummyCol[j] == 0 ){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
