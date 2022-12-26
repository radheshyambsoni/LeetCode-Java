package Arrays;

// 1920. Build Array from Permutation
// https://leetcode.com/problems/build-array-from-permutation/
// Related Topics - Array, Simulation

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[nums[i]];
        }
        
        return ans;
    }
}