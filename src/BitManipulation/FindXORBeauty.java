package BitManipulation;

// https://leetcode.com/problems/find-xor-beauty-of-array/ - Medium
// Runtime 1 ms Beats 100%
// Memory 59.1 MB Beats 29.51%
// January 11, 2023

public class FindXORBeauty{
    // ((nums[i] | nums[j]) & nums[k]) and ((nums[j] | nums[i]) & nums[k]) are equal. So, their bitwise XOR is 0.Thus, we only need to deal with the triplets (i, j, k) where i == j.
    // For i == j, ((nums[i] | nums[j]) & nums[k]) = ((nums[i] | nums[i]) & nums[k]) = nums[i] & nums[k]. So, nums[i] & nums[k] and nums[k] & nums[i] are equal. So, now the pair of (i, k) where i != k, the bitwise XOR of nums[i] & nums[k] and nums[k] & nums[i] is 0. So, we only need to deal with i == k.
    // So, we only need to consider the triplets (i, j, k) where i == j == k, so our ans reduces to the bitwise XOR of ((nums[i] | nums[j]) & nums[k]) = ((nums[i] | nums[i]) & nums[i]) = nums[i].
    public int xorBeauty(int[] nums) {
        int xor=0,n=nums.length;
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        return xor;
    }
}