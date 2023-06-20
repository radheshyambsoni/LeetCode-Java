package Arrays.Medium;

import java.util.Arrays;

// 2090. K Radius Subarray Averages
// https://leetcode.com/problems/k-radius-subarray-averages/
// Runtime 9 ms Beats 97.74%
// Memory 62.1 MB Beats 49.69%
// June 20, 2023

public class KRadiusSubarrAverages_2090 {
    public int[] getAverages(int[] nums, int k) {
        if(k==0) return nums;
        int size=2*k+1;
        
        if(size>nums.length){
            Arrays.fill(nums,-1);
            return nums;
        }
        
        long sum = 0L;
        for(int i=0;i<size;i++){
            sum+=nums[i];
        }
        
        int[] ans=new int[nums.length];
        Arrays.fill(ans, -1);
        
        ans[k] =(int)(sum/size);
        for(int i=k+1;i<nums.length-k;i++){
            sum+=nums[i+k]-nums[i-k-1];
            ans[i]=(int)(sum/size);
        }
        return ans;
    }
}