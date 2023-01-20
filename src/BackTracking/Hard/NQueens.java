package BackTracking.Hard;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/n-queens/ - Hard

public class NQueens {
    // Runtime 1 ms Beats 100%
    // Memory 41.8 MB Beats 99.98%
    // January 07, 2023
    // space optimised solution using hashing
    List<List<String>> ans=new ArrayList<>();
    boolean[] vertRow, diagLeft, diagRight;
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='.';
            }
        }
        vertRow=new boolean[n];
        diagLeft=new boolean[2*n-1];
        diagRight=new boolean[2*n-1];
        solve(board, 0,n);
        return ans;
    }
    private void solve(char[][] board,int row,int n){
        if(row==n){
            add2Ans(board);
            return;
        }

        for (int col=0;col<n;col++){
            if(!vertRow[col] && !diagLeft[(n-1)+(row-col)] && !diagRight[row+col]){
                vertRow[col]=true;
                diagLeft[(n-1)+(row-col)]=true;
                diagRight[row+col]=true;
                board[row][col]='Q';
                solve(board, row+1, n);
                board[row][col]='.';
                vertRow[col]=false;
                diagLeft[(n-1)+(row-col)]=false;
                diagRight[row+col]=false;
            }
        }
    }    
    private void add2Ans(char[][] board){
        List<String> l=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            l.add(String.valueOf(board[i]));
        }
        ans.add(l);
    }

    // Runtime 4 ms Beats 83.55%
    // Memory 45.3 MB Beats 61.29%
    // List<List<String>> ans=new ArrayList<>();
    // public List<List<String>> solveNQueens(int n) {
    //     nQueens(new boolean[n][n],0);
    //     return ans;
    // }
    // void nQueens(boolean[][] board,int row){
    //     if(row==board.length){
    //         addList2Ans(board);
    //         return;
    //     }        
    //     // placing the queen and checking for every row and column
    //     for(int col=0;col<board.length;col++){
    //         // place the queen where it is safe to
    //         if(isSafe(board,row,col)){
    //             board[row][col]=true;
    //             nQueens(board,row+1);
    //             board[row][col]=false;
    //         }
    //     }
    // }
    // boolean isSafe(boolean[][] board, int row, int col) {
    //     // check vertical row
    //     for(int i=0;i<row;i++){
    //         if(board[i][col]){
    //             return false;
    //         }
    //     }

    //     // diagonal left
    //     int maxLeft=Math.min(row,col);
    //     for(int i=1;i<=maxLeft;i++){
    //         if(board[row-i][col-i]){
    //             return false;
    //         }
    //     }
        
    //     // diagonal right
    //     int maxRight=Math.min(row,board.length-col-1);
    //     for(int i=1;i<=maxRight;i++){
    //         if(board[row-i][col+i]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // void addList2Ans(boolean[][] board) {
    //     ArrayList<String> al=new ArrayList<>();
    //     StringBuilder sb=new StringBuilder();
    //     for(boolean[] row:board){
    //         for(boolean e:row){
    //             if(e){
    //                 sb.append("Q");
    //             }else{
    //                 sb.append(".");
    //             }
    //         }
    //         al.add(sb.toString());
    //         sb.setLength(0);
    //     }
    //     ans.add(al);
    // }
}