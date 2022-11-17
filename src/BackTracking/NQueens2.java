package BackTracking;

// https://leetcode.com/problems/n-queens-ii/ - Hard
// Runtime 3 ms Beats 75.97%
// Memory 40.9 MB Beats 55.1%

public class NQueens2 {
    public int totalNQueens(int n) {
        return nQueens(new boolean[n][n],0);
    }
    int nQueens(boolean[][] board,int row){
        if(row==board.length){            
            return 1;
        }
        int count=0;
        // placing the queen and checking for every row and column
        for(int col=0;col<board.length;col++){
            // place the queen where it is safe to
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=nQueens(board,row+1);
                board[row][col]=false;
            }
        }
        
        return count;
    }
    boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        // diagonal left
        int maxLeft=Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        
        // diagonal right
        int maxRight=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}