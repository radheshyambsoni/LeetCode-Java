package Strings.Easy;

// 387. First Unique Character in a String
// https://leetcode.com/problems/first-unique-character-in-a-string/
// Runtime 1 ms Beats 100%
// Memory 48.4 MB Beats 32.15%

public class FirstUniqCharInAStr{
    public int firstUniqChar(String s) {
        int ans=Integer.MAX_VALUE;
        for(char c='a';c<='z';c++){
            int index=s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans=Math.min(ans,index);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}