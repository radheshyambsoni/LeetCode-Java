package Strings;

// https://leetcode.com/problems/sum-of-digits-of-string-after-convert/submissions/ - Easy
// Runtime: 1 ms, faster than 98.62% of Java online submissions for Sum of Digits of String After Convert.
// Memory Usage: 42.3 MB, less than 63.62% of Java online submissions for Sum of Digits of String After Convert.

public class SumOFDigitsOfStringAfterConvert {
    int sumOfDigits(int n){
        int num=0;
        while(n>0){
            num+=n%10;
            n/=10;
        }
        return num;
    }
    int getLucky(String s,int k){        
        int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            a[i]=(int)(s.charAt(i)-96);
        }
        int ans=0;
        for(int i=0;i<a.length;i++){
            ans+=sumOfDigits(a[i]);
        }
        for(int i=1;i<k;i++){
            ans=sumOfDigits(ans);
        }
        return ans;
    }
}