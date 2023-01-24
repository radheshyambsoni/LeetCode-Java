package Arrays.Easy;

// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
// Runtime 0 ms Beats 100%
// Memory 40.3 MB Beats 96.79%
// January 05, 2023

public class DetermineWhetherMatrixCanBeObtByRot {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(check(mat,target)){//0
            return true;
        }
        rotate(mat);
        if(check(mat,target)){ //1
            return true;
        }
        rotate(mat);
        if(check(mat,target)){ //2
            return true;
        }
        rotate(mat);
        if(check(mat,target)){ //3
            return true;
        }
        return false;
    }
    private boolean check(int[][] a,int[][] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]!=b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    private void rotate(int[][] matrix){
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