package Strings.Easy;

// 125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/
// Related Topics - Two pointers, String
// Runtime 2 ms Beats 99.93%
// Memory 43.6 MB Beats 62.17%

public class ValidPalindrome {
    public static boolean isPalindrome(String s){     
        int i=0,j=s.length()-1;
        int a,b;
        while(i<=j){
            a=(int)s.charAt(i);
            b=(int)s.charAt(j);

            if((a<65 || a>90) && (a<48 || a>57) && (a<97 || a>122)){
                i++;
                continue;
            }else if((b<65 || b>90) && (b<48 || b>57) && (b<97 || b>122)){
                j--;
                continue;
            }else{
                if(a>96 && a<123){a-=32;}
                if(b>96 && a<123){b-=32;}

                if(a!=b){return false;}

                i++;
                j--;
            }
        }
        return true;
    }
}