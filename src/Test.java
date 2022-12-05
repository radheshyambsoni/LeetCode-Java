public class Test {
    public boolean exist(char[][] board, String word) {
        return check(board, new boolean[board.length][board[0].length], word.toCharArray(),0,0,0);
    }
    private boolean check(char[][] board,boolean[][] matrix,char[] word,int index,int row,int col){
        if(index==word.length){
            return true;
        }

        // if(col==)

        if(row<board.length && row>=0){
            if(board[row][col]==word[index]){
                // up
                // down
                // left
                // right
            }
            check(board, matrix, word, index, row, col+1);
        }
        return false;
    }    
}