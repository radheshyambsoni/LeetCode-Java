package Arrays.Matrix;

import java.util.ArrayList;
import java.util.List;

// 1380. Lucky Numbers in a Matrix
// https://leetcode.com/problems/lucky-numbers-in-a-matrix/
// Related Topics - Array, Matrix

public class LuckyNumbersInMatrix {
    private static int minColInRow(int[][] matrix,int row){
        int min=matrix[row][0],minIdx=0;
        for(int col=1;col<matrix[0].length;col++){
            if(matrix[row][col]<min){
                min=matrix[row][col];
                minIdx=col;
            }
        }
        return minIdx;
    }
    private static boolean isMaxInCol(int[][] matrix, int minCol, int val) {
        for(int row=0;row<matrix.length;row++){
            if(matrix[row][minCol]>val){return false;}
        }
        return true;
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> lucky=new ArrayList<>();        
        for(int row=0;row<matrix.length;row++){
            int minCol=minColInRow(matrix, row);
            int val=matrix[row][minCol];
            if(isMaxInCol(matrix,minCol,val)){
                lucky.add(val);
            }
        }
        return lucky;
    }    
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));
    }
}
