package Arrays.Medium;

// 2161. Partition Array According to Given Pivot
// https://leetcode.com/problems/partition-array-according-to-given-pivot/
// Runtime 5 ms Beats 81.48%
// Memory 55.4 MB Beats 82.79%
// Feb 17, 2023

public class PartitionArrAcc2GivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        int idx=0;
        for(int i:nums){
            if(i<pivot){
                ans[idx++]=i;
            }
        }
        for(int i:nums){
            if(i==pivot){
                ans[idx++]=i;
            }
        }
        for(int i:nums){
            if(i>pivot){
                ans[idx++]=i;
            }
        }
        return ans;
    }
}
