package BitManipulation.Easy;

// https://leetcode.com/problems/find-the-difference/
// Runtime 1 ms Beats 99.92%
// Memory 40.5 MB Beats 82.6%
// January 17, 2023

public class FindTheDifference{
    public char findTheDifference(String s, String t) {
        int ans=0;
        for(char c:s.toCharArray()){
            ans^=(int)c;
        }
        for(char c:t.toCharArray()){
            ans^=(int)c;
        }
        return (char)ans;
    }
}