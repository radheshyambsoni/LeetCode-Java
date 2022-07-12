package Arrays;

// 1252. Cells with Odd Values in a Matrix
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/submissions/
// Related Topics - Array, Math, Simulation

public class CellsWithOddValuesInMatrix {
    public static int oddCells(int m, int n, int[][] indices) {
        int count=0;
        int[][] ans=new int[m][n];
        for(int i=0;i<indices.length;i++){
            int j=indices[i][0];
            for(int k=0;k<n;k++){
                ans[j][k]++;
            }
            j=indices[i][1];
            for(int k=0;k<m;k++){
                ans[k][j]++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ans[i][j]%2!=0){
                    count++;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        System.out.println(oddCells(2, 3, new int[][]{{0,1},{1,1}}));
    }
}
