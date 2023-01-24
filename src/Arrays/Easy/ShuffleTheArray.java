package Arrays.Easy;

// 1470. Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/
// Related Topics - Array

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int idx=0;
        for(int i=0;i<n;i++){
            ans[idx++]=nums[i];
            ans[idx++]=nums[i+n];
        }
        return ans;
    }
}
