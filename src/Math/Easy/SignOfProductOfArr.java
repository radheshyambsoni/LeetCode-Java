package Math.Easy;

// https://leetcode.com/problems/sign-of-the-product-of-an-array/
// Runtime 1 ms Beats 79.56%
// Memory 44.1 MB Beats 44.88%

public class SignOfProductOfArr{
    public int arraySign(int[] nums) {
        int prod=1;
        for(int i:nums){
            if(i==0){
                return 0;
            }
            if(i<0){
                prod*=-1;
            }
        }
        return prod;
    }
}