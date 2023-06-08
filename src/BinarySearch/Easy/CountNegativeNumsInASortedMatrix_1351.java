package BinarySearch.Easy;

// 1351. Count Negative Numbers in a Sorted Matrix
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
// Runtime 0 ms Beats 100%
// Memory 44.3 MB Beats 15.95%

public class CountNegativeNumsInASortedMatrix_1351 {
    int findPivotIdx(int[] arr){
        int start=0,end=arr.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]>=0) start=mid+1;
            else end=mid-1;
        }
        return start;
    }
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            if(grid[i][0]<0) count+=grid[0].length;
            else if(grid[i][grid[0].length-1]>=0) continue;
            else count+=grid[0].length-findPivotIdx(grid[i]);
        }
        return count;
    }
}