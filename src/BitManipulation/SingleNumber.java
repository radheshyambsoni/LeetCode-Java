package BitManipulation;

// https://leetcode.com/problems/single-number/ - Easy
// Runtime 1 ms Beats 100%
// Memory 42.1 MB Beats 94.97%

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}
