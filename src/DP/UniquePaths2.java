package DP;

// https://leetcode.com/problems/unique-paths-ii/ - Medium
// Runtime 1 ms Beats 80.58% 
// Memory 42.4 MB Beats 29.64%

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length-1,n=obstacleGrid[0].length-1;
        if(obstacleGrid[0][0]==1 || obstacleGrid[m][n]==1){
            return 0;
        }

        boolean flag=false;
        for(int i=0;i<=m;i++){
            if(obstacleGrid[i][0]==1){
                obstacleGrid[i][0]=-1;
                flag=true;
                continue;
            }
            if(flag){
                obstacleGrid[i][0]=0;
            }else{
                obstacleGrid[i][0]=1;
            }
        }
        flag=false;
        for(int i=1;i<=n;i++){
            if(obstacleGrid[0][i]==1){
                obstacleGrid[0][i]=-1;
                flag=true;
                continue;
            }
            if(flag){
                obstacleGrid[0][i]=0;
            }else{
                obstacleGrid[0][i]=1;
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=-1;
                    continue;
                }
                if(obstacleGrid[i][j-1]!=-1){
                    obstacleGrid[i][j]=obstacleGrid[i][j-1];
                }
                if(obstacleGrid[i-1][j]!=-1){
                    obstacleGrid[i][j]+=obstacleGrid[i-1][j];
                }
            }
        }
        
        return obstacleGrid[m][n]==-1?0:obstacleGrid[m][n];
    }
}