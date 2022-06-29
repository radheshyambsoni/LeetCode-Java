package Arrays;
import java.util.Arrays;

// https://leetcode.com/problems/two-sum/
// 1. Two Sum

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int i=0,j=1;
        int idx[]={-1,-1};
        while(i<(nums.length-1) && j<nums.length){
            if(j==nums.length-1){
                if(nums[i]+nums[j]!=target){
                    j=++i+1;continue;
                }else{
                    idx[0]=i;
                    idx[1]=j;
                    break;
                }
            }
            if(nums[i]+nums[j]==target){
                idx[0]=i;
                idx[1]=j;
                break;
            }
            j++;
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(twoSum(arr,4)));
    }
}
