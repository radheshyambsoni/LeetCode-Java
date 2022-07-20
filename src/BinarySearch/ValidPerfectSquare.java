package BinarySearch;

// 367. Valid Perfect Square
// https://leetcode.com/problems/valid-perfect-square/
// Related Topics - Math, Binary Search

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long low=1,high=num,mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid>num){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}