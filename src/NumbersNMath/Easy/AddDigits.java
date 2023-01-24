package NumbersNMath.Easy;

// 258. Add Digits
// https://leetcode.com/problems/add-digits/
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.
// Memory Usage: 41.8 MB, less than 24.06% of Java online submissions for Add Digits.

public class AddDigits {
    public int addDigits(int num) {
        int ans=0;
        while(num!=0){
            ans+=num%10;
            num/=10;
            if(ans>=10 && num==0){
                num=ans;
                ans=0;
            }
        }
        return ans;
    }
}
