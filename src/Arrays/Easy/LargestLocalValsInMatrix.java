package Arrays.Easy;

// https://leetcode.com/problems/largest-local-values-in-a-matrix/
// Runtime 3 ms Beats 85.45%
// Memory 43.6 MB Beats 78.82%
// December 23, 2022

public class LargestLocalValsInMatrix{
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] maxLocal=new int[n-2][n-2];
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                maxLocal[i-1][j-1]=getLocalMax(grid,i,j);
            }
        }
        return maxLocal;
    }
    int getLocalMax(int[][] grid,int i,int j){
        int max=grid[i][j];
        for(int p=i-1;p<i+2;p++){
            for(int q=j-1;q<j+2;q++){
                if(max<grid[p][q]){
                    max=grid[p][q];
                }
            }
        }
        return max;
    }
}