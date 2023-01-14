package Strings;

import java.util.ArrayList;

// https://leetcode.com/problems/reverse-vowels-of-a-string/ - Easy
// Runtime 4 ms Beats 85.2%
// Memory 43.5 MB Beats 61.48%
// January 14, 2023

public class ReverseVowelsOfString {
    public static String reverseVowels(String s) {
        char[] str=s.toCharArray();
        ArrayList<Integer> idx=new ArrayList<>();
        ArrayList<Character> ch=new ArrayList<>();
        for (int i=0;i<str.length;i++) {
            if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U'){
                idx.add(i);
                ch.add(str[i]);
            }
        }
        int n=idx.size()-1;
        for(int i=0;i<idx.size();i++){
            str[idx.get(i)]=ch.get(n-i);
        }
        return String.valueOf(str);
    }
}