package Strings.Easy;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/ - Easy
// Daily Challenge Question - September 22, 2022
// Related Topics - String, Two pointers

public class ReverseWordsInAString3 {
    public static String reverseWords(String s) {
        // StringBuilder word=new StringBuilder("");
        // StringBuilder ans=new StringBuilder("");
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==' '){ans.append(
        //         word.reverse());ans.append(" ");
        //         word.setLength(0);
        //     }
        //     else{word.append(s.charAt(i));}
        // }
        // ans.append(word.reverse());
        // return ans.toString();

        // more efficient way is to use the char array n returning the same as string
        int i=0;
        char[] ans=s.toCharArray();
        for(int j=0;j<ans.length;j++){
            if(ans[j]==' '){
                reverse(i,j-1,ans);
                i=j+1;
            }else if(j==ans.length-1){
                reverse(i,j, ans);
            }
        }
        return new String(ans);
    }
    static void reverse(int start,int end,char[] ans){
        while(start<end){
            char temp=ans[start];
            ans[start]=ans[end];
            ans[end]=temp;
            start++;
            end--;
        }
    }
}