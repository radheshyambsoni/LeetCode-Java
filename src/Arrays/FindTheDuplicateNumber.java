package Arrays;

// https://leetcode.com/problems/find-the-duplicate-number/ - Medium
// Runtime: 2 ms, faster than 99.89% of Java online submissions for Find the Duplicate Number.
// Memory Usage: 58.4 MB, less than 99.43% of Java online submissions for Find the Duplicate Number.

public class FindTheDuplicateNumber{
    public int findDuplicate(int[] nums) {
        // Cyclic sort
        // int i=0;
        // while(i<nums.length){
        //     int correctIdx=nums[i]-1;
        //     if(nums[i]!=nums[correctIdx]){
        //         int temp=nums[i];
        //         nums[i]=nums[correctIdx];
        //         nums[correctIdx]=temp;
        //     }else{
        //         i++;
        //     }
        // }     
        // return nums[nums.length-1];

        
        // fastest one
        int ans=-1;
        boolean[] check=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(!check[nums[i]]){
                check[nums[i]]=true;
            }else{
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}