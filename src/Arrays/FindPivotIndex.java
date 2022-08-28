package Arrays;

// 724. Find Pivot Index - Easy
// https://leetcode.com/problems/find-pivot-index/
// Related Topics - Arrays, Prefix Sum
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Pivot Index.
// Memory Usage: 52.6 MB, less than 43.89% of Java online submissions for Find Pivot Index.

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {        
        int rightSum=0;
        for(int i=1;i<nums.length;i++){
            rightSum+=nums[i];
        }
        
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            if(leftSum==rightSum){
                return i;
            }else{
                if(i==nums.length-1){rightSum=0;}
                else{rightSum-=nums[i+1];}
                leftSum+=nums[i];
            }
        }
        return -1;
    }
}