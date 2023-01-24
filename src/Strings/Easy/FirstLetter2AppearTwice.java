package Strings.Easy;

// https://leetcode.com/problems/first-letter-to-appear-twice/
// Runtime 0 ms Beats 100%
// Memory 40.1 MB Beats 93.4%
// December 16, 2022
// Related Topics - String, Hashing, Counting

public class FirstLetter2AppearTwice{
    public char repeatedCharacter(String s) {
        boolean[] chars=new boolean[26];
        char[] str=s.toCharArray();
        int idx=-1;
        for(int i=0;i<str.length;i++){
            idx=str[i]-'a';
            if(!chars[idx]){
                chars[idx]=true;
            }else{
                break;
            }
        }
        return (char)('a'+idx);
    }
}