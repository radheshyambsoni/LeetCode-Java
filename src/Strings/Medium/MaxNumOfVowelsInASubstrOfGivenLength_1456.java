package Strings.Medium;

// 1456. Maximum Number of Vowels in a Substring of Given Length
// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
// Runtime 12 ms Beats 92.86%
// Memory 43.2 MB Beats 54.76%
// May 05, 2023

public class MaxNumOfVowelsInASubstrOfGivenLength_1456 {
    public int maxVowels(String s, int k) {
        int count=0,i=0,j=0;
        while(j<k){
            char c=s.charAt(j++);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') count++;
        }
        int max=count;
        int n=s.length();
        while(j<n){
            char c1=s.charAt(j++);
            char c2=s.charAt(i++);
            if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u') count++;
            if(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u') count--;
            max=Math.max(max,count);
        }
        return max;
    }
}
