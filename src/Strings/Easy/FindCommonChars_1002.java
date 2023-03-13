package Strings.Easy;

import java.util.ArrayList;
import java.util.List;

// 1002. Find Common Characters
// https://leetcode.com/problems/find-common-characters/
// Runtime 1 ms Beats 100%
// Memory 42.5 MB Beats 61.56%

public class FindCommonChars_1002{
  public List<String> commonChars(String[] words){
        int[] freq=count(words[0]);
        for(int i=1;i<words.length;i++){
            freq=findCommon(freq,count(words[i]));
        }
        List<String> ans=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                char a='a';
                a+= i;
                String s=String.valueOf(a);
                while(freq[i]>0){
                    ans.add(s);
                    freq[i]--;
                }
            }
        }
        return ans;
    }

    int[] findCommon(int[] a, int[] b){
        int[] t=new int[26];
        for(int i=0;i<26;i++){
            t[i]=Math.min(a[i], b[i]);
        }
        return t;
    }

    int[] count(String str){
        int[] t=new int[26];
        for(char c:str.toCharArray()) t[c-'a']++;
        return t;
    }
}
