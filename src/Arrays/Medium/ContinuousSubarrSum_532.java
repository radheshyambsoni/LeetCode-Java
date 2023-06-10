package Arrays.Medium;

// 523. Continuous Subarray Sum
// https://leetcode.com/problems/continuous-subarray-sum/
// Runtime 3 ms Beats 99.86%
// Memory 56.5 MB Beats 44.28%
// Jun 10, 2023

public class ContinuousSubarrSum_532 {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length==1) return false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==0 && nums[i-1]==0) return true;
        }
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
            if(nums[i]%k==0) return true;
            int j=i-2;
            while(j>=0 && (nums[i]-nums[j])>=k){
                if((nums[i]-nums[j])%k==0) return true;
                j--;
            }
        }
        return false;
    }
}