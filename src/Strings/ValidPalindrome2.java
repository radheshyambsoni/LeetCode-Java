package Strings;

// https://leetcode.com/problems/valid-palindrome-ii/ - Easy
// Runtime 9 ms Beats 83.83%
// Memory 42.4 MB Beats 99.89%

public class ValidPalindrome2 {    
    public static boolean validPalindrome(String s) {
        if(s.length()<=2){
            return true;
        }
        int i=0,j=s.length()-1;        
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
        }
        return true;
    }
    public static boolean isPalindrome(String s, int i, int j) {
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(validPalindrome("ebcbbececabbacecbbcbe"));
    }
}