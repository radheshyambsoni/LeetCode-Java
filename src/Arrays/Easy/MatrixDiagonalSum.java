package Arrays.Easy;

// 1572. Matrix Diagonal Sum
// https://leetcode.com/problems/matrix-diagonal-sum/
// Related Topics - Array, Matrix

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int diagSum=0;
        for(int i=0;i<mat.length;i++){
            diagSum+=mat[i][i];
        }for(int i=0;i<mat.length;i++){
            diagSum+=mat[mat.length-i-1][i];
        }
        if(mat.length%2!=0){diagSum-=mat[mat.length/2][mat.length/2];}
        
        return diagSum;
    }
}
