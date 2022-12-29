package Arrays;

// https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
// Runtime 2 ms Beats 87.1%
// Memory 42.2 MB Beats 99.18%
// December 29, 2022

public class NumOfRectThatFormTheLargestSqr {
    public int countGoodRectangles(int[][] rectangles) {
        int[] arr=new int[rectangles.length];
        int max=0;
        for(int i=0;i<rectangles.length;i++){
            arr[i]=Math.min(rectangles[i][0],rectangles[i][1]);
            max=Math.max(max,arr[i]);
        }
        int count=0;
        for(int i:arr){
            if(i==max){
                count++;
            }
        }
        return count;
    }
}