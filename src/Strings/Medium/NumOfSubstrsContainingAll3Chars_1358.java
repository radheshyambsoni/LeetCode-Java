package Strings.Medium;

// 1358. Number of Substrings Containing All Three Characters
// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
// Runtime 12 ms Beats 73.63%
// Memory 43.7 MB Beats 41.16%
// June 19, 2023

public class NumOfSubstrsContainingAll3Chars_1358 {
    public int numberOfSubstrings(String s) {
        if(s.length()<3) return 0;
        int i=0,j=0,count=0,n=s.length();
        int[] f=new int[3];
        for(;j<3;j++){
            f[s.charAt(j)-'a']++;
        }
        while(i<n-2 && j<=n){
            if(f[0]>0 && f[1]>0 && f[2]>0){
                count+=n-j+1;
                f[s.charAt(i++)-'a']--;
            }
            else{
                if(j<n) f[s.charAt(j++)-'a']++;
                else j++;
            }
        }
        return count;
    }
}