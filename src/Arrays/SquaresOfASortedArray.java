package Arrays;
import java.util.Arrays;

// 977. Squares of a Sorted Array
// https://leetcode.com/problems/squares-of-a-sorted-array/
// Related Topics - Arrays, Two Pointers, Sorting

public class SquaresOfASortedArray{
    public static int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int i=0,j=nums.length-1,k=ans.length-1;
        while(k>=0){
            if(Math.abs(nums[i])>=Math.abs(nums[j])){
                ans[k--]=nums[i]*nums[i++];
            }else{
                ans[k--]=nums[j]*nums[j--];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={-10000,-9999,-7,-5,5,6,10000};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}