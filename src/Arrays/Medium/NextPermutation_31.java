package Arrays.Medium;

// 31. Next Permutation
// https://leetcode.com/problems/next-permutation/
// Runtime 0 ms Beats 100%
// Memory 42.2 MB Beats 64.17%
// Jul 08, 2022

public class NextPermutation_31 {
    void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }

        if(idx==-1){
            reverse(nums,0,n-1);
            return;
        }

        for(int i=n-1;i>idx;i--){
            if(nums[idx]<nums[i]){
                int temp=nums[idx];
                nums[idx]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        reverse(nums,idx+1,n-1);
    }
}