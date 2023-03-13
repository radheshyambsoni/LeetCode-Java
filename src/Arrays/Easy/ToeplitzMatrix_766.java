package Arrays.Easy;

// 766. Toeplitz Matrix
// https://leetcode.com/problems/toeplitz-matrix/
// Runtime 1 ms Beats 53.11%
// Memory 42.6 MB Beats 32.45%
// Mar 11, 2023

public class ToeplitzMatrix_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;

        for(int i=0;i<n;i++){
            int r=0,c=i;
            while(r<m && c<n){
                if(r>0 && c>0 && matrix[r][c]!=matrix[r-1][c-1]) return false;
                r++;c++;
            }
        }

        for(int i=1;i<m;i++){
            int r=i,c=0;
            while(r<m && c<n){
                if(r>0 && c>0 && matrix[r][c]!=matrix[r-1][c-1]) return false;
                r++;c++;
            }
        }

        return true;
    }
}
