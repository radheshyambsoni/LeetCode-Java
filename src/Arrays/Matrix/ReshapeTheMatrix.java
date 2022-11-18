package Arrays.Matrix;

// 566. Reshape the Matrix
// https://leetcode.com/problems/reshape-the-matrix/
// Related Topics - Array, Matrix, Simulation

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length || (r==mat.length && c==mat[0].length)){
            return mat;
        }
        int[][] ans=new int[r][c];
        int I=0,J=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(J==mat[0].length){J=0;I++;}
                ans[i][j]=mat[I][J];
                J++;
            }
        }
        return ans;
    }
}
