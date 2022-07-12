package Arrays;

// 867. Transpose Matrix
// https://leetcode.com/problems/transpose-matrix/
// Related Topics - Array, Matrix, Simulation

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int ans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=matrix[j][i];
            }
        }        
        return ans;
    }
}
