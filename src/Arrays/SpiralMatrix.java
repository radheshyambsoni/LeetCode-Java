package Arrays;

// 54. Spiral Matrix
// https://leetcode.com/problems/spiral-matrix/
// Related Topics - Array, Matrix, Simulation

import java.util.ArrayList;
import java.util.List;


public class SpiralMatrix{
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int size=matrix.length*matrix[0].length;
        int rowStart=0,colStart=0,rowEnd=matrix.length,colEnd=matrix[0].length;
        int i=0,j=0;
        while(true){
            while(j<colEnd && ans.size()!=size){
                ans.add(matrix[i][j++]);        
            }
            if(ans.size()==size){break;}
            j--;
            i++;
            rowStart++;

            while(i<rowEnd && ans.size()!=size){
                ans.add(matrix[i++][j]);
            }
            if(ans.size()==size){break;}
            i--;
            j--;
            colEnd--;

            while(j>=colStart && ans.size()!=size){
                ans.add(matrix[i][j--]);                
            }
            if(ans.size()==size){break;}
            j++;
            i--;
            rowEnd--;

            while(i>=rowStart && ans.size()!=size){
                ans.add(matrix[i--][j]);
            }
            if(ans.size()==size){break;}
            i++;
            j++;
            colStart++;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3,11},{4,5,6,12},{7,8,9,13},{21,22,23,24}}));
    }
}
// 1 2 3 11
// 4 5 6 12
// 7 8 9 13
// 21 22 23 24