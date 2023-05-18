package Arrays.Medium;

// 289. Game of Life
// https://leetcode.com/problems/game-of-life/
// Runtime 0 ms Beats 100%
// Memory 41.1 MB Beats 26.29%
// May 18, 2023

public class GameOfLife_289 {
    public void gameOfLife(int[][] board) {
        int m=board.length,n=board[0].length;
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count=getAliveCount(board,i,j,m,n);
                if(board[i][j]==1){
                    if(count==2 || count==3) ans[i][j]=1;
                }else{
                    if(count==3) ans[i][j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            System.arraycopy(ans[i],0,board[i],0,n);
        }
    }
    int getAliveCount(int[][] board,int i,int j,int m,int n){
        int count=0;
        count+=(i>0 && j>0)?board[i-1][j-1]:0; //ldu
        count+=i>0?board[i-1][j]:0; //u
        count+=(i>0 && j<n-1)?board[i-1][j+1]:0; //rdu
        count+=j>0?board[i][j-1]:0; //l
        count+=j<n-1?board[i][j+1]:0; //r
        count+=(i<m-1 && j>0)?board[i+1][j-1]:0; //ldd
        count+=i<m-1?board[i+1][j]:0; //d
        count+=(i<m-1 && j<n-1)?board[i+1][j+1]:0; //rdd
        return count;
    }
}