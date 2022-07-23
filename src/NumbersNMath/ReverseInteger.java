package NumbersNMath;

// 7. Reverse Integer - Medium
// https://leetcode.com/problems/reverse-integer/
// Related Topics - Math

public class ReverseInteger {
    public int reverse(int x) {        
        long ans=0;
        while(x!=0){
            ans=ans*10+x%10;
            x/=10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
            return 0;
        }
        return (int)ans;
    }
}