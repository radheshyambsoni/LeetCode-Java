package Arrays.Matrix;

// https://leetcode.com/problems/valid-sudoku/ - Medium
// Runtime 2 ms Beats 97.58%
// Memory 45.4 MB Beats 79.17%
// Daily LeetCode Challenge - November 23, 2022

public class ValidSudoku{
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board.length;col++){
                if(board[row][col]!='.'){
                    if(!isValid(board,row,col)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    boolean isValid(char[][] board,int row,int col){
        // check the row
        for(int c=0;c<board.length;c++){
            if(c==col){continue;}
            if(board[row][c]==board[row][col]){
                return false;
            }
        }
        
        // check the column
        for(int r=0;r<board.length;r++){
            if(r==row){continue;}
            if(board[r][col]==board[row][col]){
                return false;
            }
        }

        int rowStart=row-row%3;
        int colStart=col-col%3;
        // check the sqrtxsqrt sub grid
        for(int r=rowStart;r<(rowStart+3);r++){
            for(int c=colStart;c<(colStart+3);c++){
                if(r==row && c==col){continue;}
                if(board[r][c]==board[row][col]){
                    return false;
                }
            }
        }
        
        return true;
    }
}