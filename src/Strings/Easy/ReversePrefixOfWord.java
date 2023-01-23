package Strings.Easy;

// https://leetcode.com/problems/reverse-prefix-of-word/

public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        // Runtime 0 ms Beats 100%
        // Memory 40 MB Beats 99.43%
        int i=word.indexOf(ch);
        if(i==-1){
            return word;
        }
        char[] w=word.toCharArray();
        for(int j=0;j<=i/2;j++){
            char temp=w[j];
            w[j]=w[i-j];
            w[i-j]=temp;
        }
        return String.valueOf(w);

        // Runtime 1 ms Beats 89.89%
        // Memory 41.8 MB Beats 75.32%
        // int i=word.indexOf(ch);
        // if(i==-1){
        //     return word;
        // }
        // StringBuilder ans=new StringBuilder();
        // for(int j=i;j>=0;j--){
        //     ans.append(word.charAt(j));
        // }
        // ans.append(word.substring(i+1));
        // return ans.toString();
    }public static void main(String[] args) {
        System.out.println(reversePrefix("abcdef", 'e'));
    }
}