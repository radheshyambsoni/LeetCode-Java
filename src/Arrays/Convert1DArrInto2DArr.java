package Arrays;

// https://leetcode.com/problems/convert-1d-array-into-2d-array/submissions/ - Easy
// Runtime: 3 ms, faster than 99.94% of Java online submissions for Convert 1D Array Into 2D Array.
// Memory Usage: 52 MB, less than 91.66% of Java online submissions for Convert 1D Array Into 2D Array.

public class Convert1DArrInto2DArr {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length){return new int[0][];}
        int l=0;
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n && l<original.length;j++){
                ans[i][j]=original[l++];
            }
        }
        return ans;
    }
}
