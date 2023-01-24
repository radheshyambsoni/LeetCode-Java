package BinarySearch.Medium;

// https://leetcode.com/problems/search-a-2d-matrix/ - Medium
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search a 2D Matrix.
// Memory Usage: 42.2 MB, less than 81.00% of Java online submissions for Search a 2D Matrix.

public class Search2DMatrix {
    public boolean binarySearch(int arr[],int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=matrix.length-1;i>=0;i--){
            if(matrix[i][0]==target){return true;}
            else if(matrix[i][0]<target){
                return binarySearch(matrix[i],target);
            }
        }
        return false;
    }
}
