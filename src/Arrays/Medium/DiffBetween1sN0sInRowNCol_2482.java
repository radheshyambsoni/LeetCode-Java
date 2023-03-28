package Arrays.Medium;

// 2482. Difference Between Ones and Zeros in Row and Column
// https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/
// Runtime 5 ms Beats 96.80%
// Memory 80.2 MB Beats 68.40%
// Mar 28, 2023

public class DiffBetween1sN0sInRowNCol_2482 {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[] rows=new int[m];
        int[] cols=new int[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                rows[i]+=grid[i][j];
                cols[j]+=grid[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=2*rows[i]+2*cols[j]-m-n;
            }
        }        
        return grid;
    }
}
