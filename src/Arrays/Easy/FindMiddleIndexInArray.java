package Arrays.Easy;

// 1991. Find the Middle Index in Array
// https://leetcode.com/problems/find-the-middle-index-in-array/
// Related Topics - Arrays, Prefix Sum
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Find the Middle Index in Array.
// Memory Usage: 40.7 MB, less than 89.95% of Java online submissions for Find the Middle Index in Array.
// This problem is similar to 724 but still submissions for each other doesn't get 100% faster runtime.
public class FindMiddleIndexInArray{
	public int findMiddleIndex(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            if(leftSum==sum-nums[i]){
                return i;
            }
            
            leftSum+=nums[i];
            sum-=nums[i];
        }
        return -1;
    }
}
