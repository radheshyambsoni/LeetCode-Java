package Arrays.Matrix;

// https://leetcode.com/problems/rotate-image/ - Medium
// Runtime 0 ms Beats 100%
// Memory 41.1 MB Beats 86.94%
// December 19, 2022

public class RotateImage {
    public void rotate(int[][] matrix){
        int row=0, col=matrix.length-1;
        while(row<col){
            for(int i=0;i<col-row;i++){
                int temp=matrix[row][row+i];
                matrix[row][row+i]=matrix[col-i][row];
                matrix[col-i][row]=matrix[col][col-i];
                matrix[col][col-i]=matrix[row+i][col];
                matrix[row+i][col]=temp;
            }
            row++;
            col--;
        }
    }
}