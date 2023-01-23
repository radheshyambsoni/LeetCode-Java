package Strings.Medium;

// https://leetcode.com/problems/reverse-words-in-a-string/ - Medium
// Runtime 3 ms Beats 98.80%
// Memory 42.1 MB Beats 93.81%

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        int j;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                continue;
            }
            
            j=i;
            while(i>0 && s.charAt(i)!=' '){
                i--;
            }
            if(i==0 && s.charAt(i)!=' '){
                ans.append(s.substring(0, j+1));                
            }else{
                ans.append(s.substring(i+1, j+1));                
            }
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}
