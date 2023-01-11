package NumbersNMath;

// https://leetcode.com/problems/reverse-integer/ - Medium
// Runtime 1 ms Beats 100%
// Memory 39.4 MB Beats 88.37%
// January 10, 2023

public class ReverseInteger {
    public int reverse(int x) {
        if(x>-10 && x<10){return x;}

        int ans=0;
        int digit=0;
        while(x!=0){
            digit=x%10;
            x/=10;

            if (ans<Integer.MIN_VALUE/10 || (ans==Integer.MIN_VALUE/10 && digit<-8) || ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && digit>7)) {
                return 0;
            }
            ans=ans*10+digit;
        }

        return ans;
    }
    
    // public int reverse(int x) {        
    //     long ans=0;
    //     while(x!=0){
    //         ans=ans*10+x%10;
    //         x/=10;
    //     }
    //     if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
    //         return 0;
    //     }
    //     return (int)ans;
    // }
}