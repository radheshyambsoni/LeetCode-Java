package BitManipulation.Easy;

// 1009. Complement of Base 10 Integer
// https://leetcode.com/problems/complement-of-base-10-integer/
// Same question - https://leetcode.com/problems/number-complement/
// Runtime 0 ms Beats 100%
// Memory 39.5 MB Beats 35.32%
// January 24, 2023

public class ComplementOfBase10Integer_1009 {
    public int bitwiseComplement(int n) {
        char[] num=Integer.toBinaryString(n).toCharArray();
        int ans=0,pow=1;
        for(int i=num.length-1;i>=0;i--){
            if(num[i]=='0'){
                ans+=pow;
            }
            pow*=2;
        }
        return ans;
    }
}