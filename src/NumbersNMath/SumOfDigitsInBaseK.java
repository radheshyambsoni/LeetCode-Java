package NumbersNMath;

// https://leetcode.com/problems/sum-of-digits-in-base-k/ - Easy
// Runtime 0 ms Beats 100%
// Memory 39.4 MB Beats 72.66%
// December 24, 2022

public class SumOfDigitsInBaseK {
    public int sumBase(int n, int k) {
        if(k==10){
            return sumOfDigits(n);
        }

        int ans=0;
        while(n>0){
            ans=ans*10+n%k;
            n/=k;
        }
        return sumOfDigits(ans);
    }
    int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}