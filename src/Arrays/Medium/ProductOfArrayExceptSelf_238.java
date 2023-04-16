package Arrays.Medium;

// 238. Product of Array Except Self
// https://leetcode.com/problems/product-of-array-except-self/description/
// Runtime 1 ms Beats 100%
// Memory 50.9 MB Beats 39.47%
// Apr 16, 2023

public class ProductOfArrayExceptSelf_238 {
    public int[] productExceptSelf(int[] nums) {
        int prod=1,cntZero=0;
        boolean allZero=false;
        for(int i:nums){
            if(i==0){
                if(cntZero==0){
                    cntZero++;
                }else if(cntZero>0){
                    allZero=true;
                    break;
                }
            }else{
                prod*=i;
            }
        }
        if(allZero){
            Arrays.fill(nums,0);
        }else if(cntZero>0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]=prod;
                }else{
                    nums[i]=0;
                }
            }
        }else{
            for(int i=0;i<nums.length;i++){
                nums[i]=prod/nums[i];
            }
        }
        return nums;
    }
}
