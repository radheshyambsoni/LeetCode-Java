package Strings.Easy;

// 383. Ransom Note
// https://leetcode.com/problems/ransom-note/
// Runtime 2 ms Beats 99.8%
// Memory 42.4 MB Beats 92.92%
// January 29, 2023

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        int[] freq=new int[26];
        for(char c:magazine.toCharArray()){
            freq[c-'a']++;
        }

        for(char c:ransomNote.toCharArray()){
            int i=c-'a';
            if(freq[i]>0){
                freq[i]--;
            }else{
                return false;
            }
        }
        return true;
    }
}