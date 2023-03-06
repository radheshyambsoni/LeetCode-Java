package Arrays.Easy;

// 2057. Smallest Index With Equal Value
// https://leetcode.com/problems/smallest-index-with-equal-value/
// Runtime 1 ms Beats 100%
// Memory 42.9 MB Beats 18.84%
// March 06, 2023

public class SmallestIdxWithEqualVal_2057 {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]) return i;
        }
        return -1;
    }
}