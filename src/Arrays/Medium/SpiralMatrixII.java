package Arrays.Medium;

// 59. Spiral Matrix II
// https://leetcode.com/problems/spiral-matrix-ii/
// Related Topics - Array, Matrix, Simulation

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int size=0,e=1;
        int[][] matrix=new int[n][n];
        int rowStart=0,colStart=0,rowEnd=n,colEnd=n;
        int i=0,j=0;
        while(true){
            while(j<colEnd && size!=n*n){
                matrix[i][j++]=e++;
                size++;
            }
            if(size==n*n){break;}
            j--;
            i++;
            rowStart++;

            while(i<rowEnd && size!=n*n){
                matrix[i++][j]=e++;
                size++;
            }
            if(size==n*n){break;}
            i--;
            j--;
            colEnd--;

            while(j>=colStart && size!=n*n){
                matrix[i][j--]=e++;
                size++;
            }
            if(size==n*n){break;}
            j++;
            i--;
            rowEnd--;

            while(i>=rowStart && size!=n*n){
                matrix[i--][j]=e++;
                size++;
            }
            if(size==n*n){break;}
            i++;
            j++;
            colStart++;
        }

        return matrix;
    }
}
