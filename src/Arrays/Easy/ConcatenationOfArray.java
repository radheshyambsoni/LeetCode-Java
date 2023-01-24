package Arrays.Easy;

// 1929. Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array/
// Related Topics - Array

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}