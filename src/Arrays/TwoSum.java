package Arrays;
import java.util.Arrays;

// https://leetcode.com/problems/two-sum/
// 1. Two Sum

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {        
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(twoSum(arr,4)));
    }
}
