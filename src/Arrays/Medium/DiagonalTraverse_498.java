package Arrays.Medium;

// 498. Diagonal Traverse
// https://leetcode.com/problems/diagonal-traverse/
// Runtime 1 ms Beats 100%
// Memory 44.3 MB Beats 44.78%
// Apr 02, 2023

public class DiagonalTraverse_498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        if(m==1){
            return mat[0];
        }
        int[] ans=new int[m*n];
        if(n==1){
            for(int i=0;i<m;i++){
                ans[i]=mat[i][0];
            }
            return ans;
        }
        int idx=0,i=0,j=0;
        boolean flag=false;
        // false - going up, true - going down
        while(idx<m*n){
            if(i>=0 && i<m && j>=0 && j<n){
                ans[idx++]=mat[i][j];
                if(flag){
                    i++;
                    j--;
                }else{
                    i--;
                    j++;
                }
            }else{
                if(flag){
                    flag=false;
                    if(i>=m){
                        j+=2;
                        i--;
                    }else{
                        j++;
                    }
                }else{
                    flag=true;
                    if(j>=n){
                        i+=2;
                        j--;
                    }else{                        
                        i++;
                    }
                }
            }
        }
                
        return ans;
    }
}
