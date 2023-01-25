package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

// 17. Letter Combinations of a Phone Number
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// Runtime 5 ms Beats 45.74%
// Memory 41.2 MB Beats 87.28%

public class LetterCombiOfPhoneNum{
    static String[] letters={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    ArrayList<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return ans;
        }
        helper("", digits);
        return ans;
    }
    void helper(String p,String up){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        int idx=up.charAt(0)-'2';
        for(int i=0;i<letters[idx].length();i++){
            helper(p+letters[idx].charAt(i),up.substring(1));
        }
    }
    public static void main(String[] args) {
        LetterCombiOfPhoneNum l=new LetterCombiOfPhoneNum();
        System.out.println(l.letterCombinations("2"));      
    }
}