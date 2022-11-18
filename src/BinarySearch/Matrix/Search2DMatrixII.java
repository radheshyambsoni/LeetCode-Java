package BinarySearch.Matrix;

// 240. Search a 2D Matrix II - Medium
// https://leetcode.com/problems/search-a-2d-matrix-ii/
// Related Topics - Array, Binary Search, Divide n Conquer, Matrix

public class Search2DMatrixII{
    public boolean searchMatrix(int[][] matrix, int target) {        
        int i=matrix.length-1;
        int j=0;
        while(i>=0 && j<matrix[0].length){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]<target){
                j++;
            }else{
                i--;
            }
        }
        return false;
    }
}