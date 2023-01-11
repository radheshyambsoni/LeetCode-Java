package ConditionalsNLoops;

// https://leetcode.com/problems/palindrome-number/ - Easy
// Runtime 8 ms Beats 99.83%
// Memory 41.5 MB Beats 92.59%
// January 10, 2023

public class PalindromeNum {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)){return false;}

        int n=0;
        while(x>n){
            n=n*10+x%10;
            x/=10;
        }

        if(x==n){return true;}
        return x==(n/10);
    }
    
    // public static boolean isPalindrome(int x) {
    //     if(x<0){return false;}
        
    //     int size=(int)Math.log10(x)+1;
    //     if(size==1){return true;}
    //     int ans=0;
        
    //     for(int i=0;i<size/2;i++){
    //         ans=ans*10+x%10;
    //         x/=10;
    //     }
        
    //     if(size%2==1){x/=10;}
    //     if(x==ans){return true;}
    //     return false;
    // }
}