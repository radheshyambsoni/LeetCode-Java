package Arrays.Medium;

// https://leetcode.com/problems/find-the-duplicate-number/

public class FindTheDuplicateNumber{
    public int findDuplicate(int[] nums) {
        // December 06, 2022
        // Linked List cycle detection method - where the start of cycle is our duplicate element
        // cycle detection
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        
        // cycle start detection
        fast=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;


        // Cyclic sort
        // int i=0;
        // while(i<nums.length){
        //     if(nums[i]!=i+1){
        //         int correctIdx=nums[i]-1;
        //         if(nums[i]!=nums[correctIdx]){
        //             int temp=nums[i];
        //             nums[i]=nums[correctIdx];
        //             nums[correctIdx]=temp;
        //         }else{
        //             return nums[i];
        //         }                
        //     }else{
        //         i++;
        //     }
        // }
        // return -1;
        
        
        // Runtime: 2 ms, faster than 99.89% of Java online submissions for Find the Duplicate Number.
        // Memory Usage: 58.4 MB, less than 99.43% of Java online submissions for Find the Duplicate Number.
        // fastest one, generic one but uses space for boolean array
        // int ans=-1;
        // boolean[] check=new boolean[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     if(!check[nums[i]]){
        //         check[nums[i]]=true;
        //     }else{
        //         ans=nums[i];
        //         break;
        //     }
        // }
        // return ans;
    }
}