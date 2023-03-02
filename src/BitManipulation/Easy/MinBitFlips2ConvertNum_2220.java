package BitManipulation.Easy;

// 2220. Minimum Bit Flips to Convert Number
// https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
// Runtime 0 ms Beats 100%
// Memory 39.2 MB Beats 61.96%
// Mar 02, 2023

public class MinBitFlips2ConvertNum_2220 {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start^goal);
    }

    // Runtime 1 ms Beats 22.44%
    // Memory 39.8 MB Beats 18.56%
    // public int minBitFlips(int start, int goal) {
    //     String s=Integer.toBinaryString(start);
    //     String g=Integer.toBinaryString(goal);
    //     int i=s.length()-1,j=g.length()-1;
    //     int count=0;
    //     while(i>=0 && j>=0){
    //         if(s.charAt(i)!=g.charAt(j)){
    //             count++;
    //         }
    //         i--;
    //         j--;
    //     }
    //     while(i>=0){
    //         if(s.charAt(i)=='1') count++;
    //         i--;
    //     }
    //     while(j>=0){
    //         if(g.charAt(j)=='1') count++;
    //         j--;
    //     }

    //     return count;
    // }
}