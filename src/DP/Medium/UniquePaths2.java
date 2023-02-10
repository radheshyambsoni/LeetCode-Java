package DP.Medium;

// 63. Unique Paths II
// https://leetcode.com/problems/unique-paths-ii/
// Runtime 0 ms Beats 100%
// Memory 40.5 MB Beats 62.44%
// February 10, 2023
// complete recursion to all types dp solution - https://github.com/radheshyambsoni/DSA_KK/blob/master/src/TUF/DP/DP09_MazeObstacles.java

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] maze) {
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                if(maze[i][j]==1){
                    maze[i][j]=0;
                }else if(i==0 && j==0){
                    maze[0][0]=1;
                }
                else{                    
                    maze[i][j]=(i>0?(maze[i-1][j]):0)+(j>0?maze[i][j-1]:0);
                }
            }
        }
        return maze[maze.length-1][maze[0].length-1];
    }
}