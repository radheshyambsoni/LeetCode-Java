package Strings.Easy;

// 1189. Maximum Number of Balloons
// https://leetcode.com/problems/maximum-number-of-balloons/
// Runtime 2 ms Beats 86.27%
// Memory 41 MB Beats 67.89%
// Mar 12, 2023

public class MaxNumOfBalloons_1189{
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(char c:text.toCharArray()){
            if(c=='b') b++;
            else if(c=='a') a++;
            else if(c=='l') l++;
            else if(c=='o') o++;
            else if(c=='n') n++;
        }

        l/=2;o/=2;
        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}
