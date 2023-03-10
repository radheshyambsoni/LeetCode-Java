package Math.Easy;

// 268. Missing Number
// https://leetcode.com/problems/missing-number/

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        // Of course not the best solution by cyclic sort
        // // Cyclic sort as the given numbers are in range [0,n]
        // // here we need to ignore the last number i.e nums.length
        // int i=0;
        // while(i<nums.length){            
        //     int correctIdx=nums[i];
        //     if(nums[i]<nums.length && nums[i]!=nums[correctIdx]){
        //         int temp=nums[i];
        //         nums[i]=nums[correctIdx];
        //         nums[correctIdx]=temp;
        //     }else{
        //         i++;
        //     }
        // }
        // for(i=0;i<nums.length;i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }
        // return nums.length;
        
        // clever one
        // Runtime: 1 ms, faster than 81.42% of Java online submissions for Missing Number.
        // Memory Usage: 51.3 MB, less than 32.88% of Java online submissions for Missing Number.
        int expectedSum=(nums.length*(nums.length+1))/2;
        int actualSum=0;
        for(int i=0;i<nums.length;i++){
            actualSum+=nums[i];
        }        
        return expectedSum-actualSum;
    }
}