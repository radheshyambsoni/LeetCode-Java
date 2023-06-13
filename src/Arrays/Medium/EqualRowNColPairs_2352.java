package Arrays.Medium;

// 2352. Equal Row and Column Pairs
// https://leetcode.com/problems/equal-row-and-column-pairs/description/
// Runtime 3 ms Beats 99.86%
// Memory 48.5 MB Beats 80.58%
// Jun 13, 2023

public class EqualRowNColPairs_2352 {
    public int equalPairs(int[][] grid) {
        int n=grid.length,count=0;
        long[] rowSum=new long[n];
        long[] colSum=new long[n];
        for(int i=0;i<n;i++){
            long rSum=0,cSum=0;
            for(int j=0;j<n;j++){
                rSum=rSum*10+grid[i][j];
                cSum=cSum*10+grid[j][i];
            }
            rowSum[i]=rSum;
            colSum[i]=cSum;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(rowSum[i]==colSum[j]) count++;
            }
        }
        return count;
    }
}