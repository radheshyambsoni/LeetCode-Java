package BackTracking.Medium;

// https://leetcode.com/problems/word-search/ - Medium
// Runtime 85 ms Beats 96.33%
// Memory 41.9 MB Beats 66.16%
// December 06, 2022

public class WordSearch {
    public  boolean exist(char[][] board, String word) {
        return check(board, new boolean[board.length][board[0].length], word.toCharArray(),0,0,0);
    }
    private  boolean check(char[][] board,boolean[][] matrix,char[] word,int index,int row,int col){
        if(index==word.length){
            return true;
        }        

        if(col==board[0].length && index==0){
            return check(board, matrix, word, index, row+1, 0);
        }

        if(row>=0 && row<board.length && col>=0 && col<board[0].length){
            if(board[row][col]==word[index]){
                if(index==word.length-1){
                    return true;
                }
                matrix[row][col]=true;
                // up
                if(row>0 && !matrix[row-1][col] && check(board,matrix,word,index+1,row-1,col)){
                    return true;
                }
                
                // down
                if(row<board.length-1 && !matrix[row+1][col] && check(board,matrix,word,index+1,row+1,col)){
                    return true;
                }

                // left
                if(col>0 && !matrix[row][col-1] && check(board,matrix,word,index+1,row,col-1)){
                    return true;
                }

                // right
                if(col<board[0].length-1 && !matrix[row][col+1] && check(board,matrix,word,index+1,row,col+1)){
                    return true;
                }
                matrix[row][col]=false;
            }
            if(index==0 && check(board, matrix, word, index, row, col+1)){
                return true;
            }
        }
        return false;
    }    
}