package Strings.Medium;

import java.util.Arrays;

// 1781. Sum of Beauty of All Substrings
// https://leetcode.com/problems/sum-of-beauty-of-all-substrings/
// Runtime 95 ms Beats 30.77%
// Memory 40.9 MB Beats 96.87%
// May 20, 2023

class Solution {
    public int beautySum(String s) {
        int[] freq=new int[26];
        int n=s.length(),sum=0;
        for(int i=0;i<n;i++){
            int max=-1;
            for(int j=i;j<n;j++){
                int min=501;
                int idx=s.charAt(j)-'a';
                freq[idx]++;
                if(freq[idx]>max) max=freq[idx];
                for(int f:freq){
                    if(f!=0 && f<min) min=f;
                }
                sum+=(max-min);
            }
            Arrays.fill(freq,0);
        }
        return sum;
    }
}