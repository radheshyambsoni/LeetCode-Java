package DP.Medium;

import java.util.Arrays;

// 91. Decode Ways
// https://leetcode.com/problems/decode-ways/
// Runtime 0 ms Beats 100%
// Memory 40.8 MB Beats 63.15%
// Jul 17, 2023

// Memoization
public class DecodeWays_91 {
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return f(s, 0, dp);
    }
    int f(String s, int idx, int[] dp){
        if(idx==s.length()){
            return 1;
        }

        if(dp[idx]!=-1) return dp[idx];
        if(s.charAt(idx)=='0') return 0;
        int count=0;
        char c=s.charAt(idx);
        if(c=='1'){
            if(idx+1<s.length()){
                count+=f(s, idx+2, dp);
            }
        }else if(c=='2'){
            if(idx+1<s.length() && s.charAt(idx+1)<'7'){
                count+=f(s, idx+2, dp);
            }
        }
        return dp[idx]=count+f(s, idx+1, dp);
    }
}

// Tabulation
// public class DecodeWays_91 {
//     public int numDecodings(String s) {
//         if(s.charAt(0)=='0') return 0;
//         int[] dp=new int[s.length()];
//         dp[dp.length-1] = s.charAt(s.length()-1) == '0' ? 0 : 1;
//         for(int idx=s.length()-2;idx>=0;idx--){
//             if(s.charAt(idx)=='0'){
//                 dp[idx]=0;
//                 continue;
//             }

//             int count=0;
//             char c=s.charAt(idx);
//             if(c=='1'){
//                 count += idx+2<s.length() ? dp[idx+2] : 1;                
//             }else if(c=='2'){
//                 if(s.charAt(idx+1)<'7'){
//                     count += idx+2<s.length() ? dp[idx+2] : 1;
//                 }
//             }
//             dp[idx]=count+dp[idx+1];
//         }
//         return dp[0];
//     }    
// }