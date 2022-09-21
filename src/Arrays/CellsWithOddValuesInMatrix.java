package Arrays;

// Optimised version came from submissions section
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/submissions/
// Runtime: 2 ms, faster than 71.71% of Java online submissions for Cells with Odd Values in a Matrix.
// Memory Usage: 42.7 MB, less than 19.40% of Java online submissions for Cells with Odd Values in a Matrix.

public class CellsWithOddValuesInMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        // the value at any index of rows and cols arrays 
        // here represents the number of times the row/column is incremented 
        int rows[]=new int[m];
        int cols[]=new int[n];
        for(int idx[]: indices){
            rows[idx[0]]++;
            cols[idx[1]]++;
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                // here the sum 'rows[i]+cols[j]' represents the number of times
                // the actual index in the expected array would have been incremented
                if((rows[i]+cols[j])%2==1){
                    count++;
                }
            }
        }
        return count;
    }
}
