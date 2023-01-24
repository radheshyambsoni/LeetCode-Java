package Arrays.Medium;

// 2221. Find Triangular Sum of an Array
// https://leetcode.com/problems/find-triangular-sum-of-an-array/
// Related Topics - Array, Math, Simulation, Combinatorics

public class FindTriangularSumOfArray {
    public int triangularSum(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                nums[j]=(nums[j]+nums[j+1])%10;
            }
        }        
        return nums[0];
    }
}