package Arrays.Easy;

// 1582. Special Positions in a Binary Matrix
// https://leetcode.com/problems/special-positions-in-a-binary-matrix/
// Runtime 1 ms Beats 100%
// Memory 43.1 MB Beats 25.36%
// Mar 14, 2023

class Solution {
    public int numSpecial(int[][] mat){
        int m=mat.length,n=mat[0].length;
        int[] rowsum=new int[m];
        int[] colsum=new int [n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    rowsum[i]++;
                    colsum[j]++;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<mat[i].length;j++){ 
                if(mat[i][j]==1 && rowsum[i]==1 && colsum[j]==1) count++;
            }
        }
        return count;
    }
}