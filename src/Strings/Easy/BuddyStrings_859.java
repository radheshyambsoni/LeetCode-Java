package Strings.Easy;

// 859. Buddy Strings
// https://leetcode.com/problems/buddy-strings/
// Runtime 2 ms Beats 79.89%
// Memory 41.7 MB Beats 57.51%
// Jul 03, 2023

public class BuddyStrings_859 {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.equals(goal)){
            if(s.length()==1) return false;
            int[] freq=new int[26];
            for(char c:s.toCharArray()){
                freq[c-'a']++;
                if(freq[c-'a']>1) return true;
            }
            return false;
        }

        char[] str=s.toCharArray();
        int i=0, j=str.length-1;
        while(i<str.length){
            if(str[i]!=goal.charAt(i)) break;
            i++;
        }
        while(j>i){
            if(str[j]!=goal.charAt(j)) break;
            j--;
        }
        if(j<=i) return false;
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
        return String.valueOf(str).equals(goal);
    }
}