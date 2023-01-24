package Arrays.Medium;

// https://leetcode.com/problems/set-matrix-zeroes/
// Runtime 1 ms Beats 95.67%
// Memory 44 MB Beats 81.43%
// December 19, 2022

public class SetMatrix0s{
    public void setZeroes(int[][] matrix) {
        // Using the 0th row and 0th column keep track of the rows and column to be reset
        boolean firstRow=false,firstCol=false;
        
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                firstCol=true;
                break;
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                firstRow=true;
                break;
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstRow){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=0;
            }            
        }
        if(firstCol){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }

        // Not the best takes additional space to keep track of the rows and column to be reset
        // boolean[] zeroRows=new boolean[matrix.length];
        // boolean[] zeroCols=new boolean[matrix[0].length];
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==0){
        //             zeroRows[i]=true;
        //             zeroCols[j]=true;
        //         }
        //     }
        // }

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(zeroRows[i] || zeroCols[j]){
        //             matrix[i][j]=0;
        //         }
        //     }
        // }
    }
}