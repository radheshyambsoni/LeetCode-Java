package Arrays.Medium;

// 2149. Rearrange Array Elements by Sign
// https://leetcode.com/problems/rearrange-array-elements-by-sign/
// Runtime 4 ms Beats 98.65%
// Memory 79.8 MB Beats 53.33%
// Feb 18, 2023

public class RearrangeArrEleBySign {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int posIdx=0,negIdx=1;
        for(int i:nums){
            if(i>0){
                ans[posIdx]=i;
                posIdx+=2;
            }else{
                ans[negIdx]=i;
                negIdx+=2;
            }
        }
        return ans;
    }
}