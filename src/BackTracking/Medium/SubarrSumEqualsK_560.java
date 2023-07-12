package BackTracking.Medium;

import java.util.HashMap;

// 560. Subarray Sum Equals K
// https://leetcode.com/problems/subarray-sum-equals-k/
// Runtime 27 ms Beats 72.46%
// Memory 46.9 MB Beats 26.19%
// Jul 02, 2023

public class SubarrSumEqualsK_560 {
    public int subarraySum(int[] nums, int k) {
        int count=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}