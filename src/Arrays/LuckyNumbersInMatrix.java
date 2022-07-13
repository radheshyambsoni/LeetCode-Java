package Arrays;
import java.util.ArrayList;
import java.util.List;

// 1380. Lucky Numbers in a Matrix
// https://leetcode.com/problems/lucky-numbers-in-a-matrix/
// Related Topics - Array, Matrix

public class LuckyNumbersInMatrix {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> lucky=new ArrayList<>();
        List<Integer> rowMin=new ArrayList<>();
        List<Integer> colMax=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=100001;
            for(int j=0;j<matrix[0].length;j++){
                if(min>matrix[i][j]){min=matrix[i][j];}
            }
            rowMin.add(min);
        }
        for(int i=0;i<matrix[0].length;i++){
            int max=0;
            for(int j=0;j<matrix.length;j++){
                if(max<matrix[j][i]){max=matrix[j][i];}
            }
            colMax.add(max);
        }
        System.out.println(rowMin);
        System.out.println(colMax);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==rowMin.get(i) && matrix[i][j]==colMax.get(j)){
                    lucky.add(matrix[i][j]);
                }
            }
        }
        
        return lucky;
    }
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));
    }
}
