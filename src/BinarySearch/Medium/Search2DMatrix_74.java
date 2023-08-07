package BinarySearch.Medium;

// 74. Search a 2D Matrix
// https://leetcode.com/problems/search-a-2d-matrix/ - Medium
// Runtime 0 ms Beats 100%
// Memory 41.4 MB Beats 17.14%
// Aug 07, 2023

// O(log(m * n))
public class Search2DMatrix_74 {
    boolean binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int start = 0, end = m - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid][0] > target) {
                end = mid - 1;
            } else if (matrix[mid][0] < target) {
                if (matrix[mid][n - 1] > target) {
                    return binarySearch(matrix[mid], 0, n - 1, target);
                } else if (matrix[mid][n - 1] < target) {
                    start = mid + 1;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}

// O(mlog(n))
// // Runtime: 0 ms, faster than 100.00% of Java online submissions for Search a
// 2D Matrix.
// // Memory Usage: 42.2 MB, less than 81.00% of Java online submissions for
// Search a 2D Matrix.

// public class Search2DMatrix_74 {
// public boolean binarySearch(int arr[],int target){
// int start=0,end=arr.length-1;
// while(start<=end){
// int mid=start+(end-start)/2;
// if(arr[mid]>target){
// end=mid-1;
// }else if(arr[mid]<target){
// start=mid+1;
// }else{
// return true;
// }
// }
// return false;
// }
// public boolean searchMatrix(int[][] matrix, int target) {
// for(int i=matrix.length-1;i>=0;i--){
// if(matrix[i][0]==target){return true;}
// else if(matrix[i][0]<target){
// return binarySearch(matrix[i],target);
// }
// }
// return false;
// }
// }