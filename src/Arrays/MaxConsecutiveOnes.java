package Arrays;

// https://leetcode.com/problems/max-consecutive-ones/ - Easy
// Runtime 1 ms Beats 100%
// Memory 43.2 MB Beats 87.74%

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,temp=0;        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                temp++;
            }else {
                count=Math.max(count,temp);
                temp=0;
            }
        }        
        return Math.max(count,temp);
    }
}
