package Arrays.Medium;

// 2326. Spiral Matrix IV
// https://leetcode.com/problems/spiral-matrix-iv/
// Runtime 8 ms Beats 70.42%
// Memory 60.9 MB Beats 26.4%
// Apr 07, 2023

public class SpiralMatrix4_2326 {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans=new int[m][n];
        ListNode temp=head;
        int rowStart=0,rowEnd=m,colStart=0,colEnd=n;
        int i=0,j=0,count=0,size=m*n;
        while(count<size){
            while(j<colEnd && count<size){
                if(temp==null){
                    ans[i][j++]=-1;                    
                }else{
                    ans[i][j++]=temp.val;
                    temp=temp.next;
                }
                count++;
            }
            if(count>=size){break;}
            j--;
            i++;
            rowStart++;

            while(i<rowEnd && count<size){
                if(temp==null){
                    ans[i++][j]=-1;
                }else{
                    ans[i++][j]=temp.val;
                    temp=temp.next;
                }
                count++;
            }
            if(count>=size){break;}
            i--;
            j--;
            colEnd--;

            while(j>=colStart && count<size){
                if(temp==null){
                    ans[i][j--]=-1;
                }else{
                    ans[i][j--]=temp.val;
                    temp=temp.next;
                }
                count++;
            }
            if(count>=size){break;}
            j++;
            i--;
            rowEnd--;

            while(i>=rowStart && count<size){
                if(temp==null){
                    ans[i--][j]=-1;
                }else{
                    ans[i--][j]=temp.val;
                    temp=temp.next;
                }
                count++;
            }
            if(count>=size){break;}
            i++;
            j++;
            colStart++;
        }
        return ans;
    }
}
