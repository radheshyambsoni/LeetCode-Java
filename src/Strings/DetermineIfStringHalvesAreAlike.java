package Strings;

// https://leetcode.com/problems/determine-if-string-halves-are-alike/ - Easy

public class DetermineIfStringHalvesAreAlike {
    public static boolean isVowel(char ch){
        switch(ch){
            case 'a':return true;
            case 'e':return true;
            case 'i':return true;
            case 'o':return true;
            case 'u':return true;
            case 'A':return true;
            case 'E':return true;
            case 'I':return true;
            case 'O':return true;
            case 'U':return true;
        }
        return false;
    }
    public static boolean halvesAreAlike(String s) {
        // int count=0,i=0,j=s.length()-1;
        // String vowels="aeiouAEIOU";
        // while(i<j){
        //     if(vowels.indexOf(s.charAt(i++))!=-1){
        //         count++;
        //     }
        //     if(vowels.indexOf(s.charAt(j--))!=-1){
        //         count--;
        //     }
        // }        
        // return count==0;

        // Runtime 2 ms Beats 99.33%
        // Memory 40.1 MB Beats 99.87%
        int count1=0,count2=0,i=0,j=s.length()-1;
        while(i<j){
            if(isVowel(s.charAt(i++))){
                count1++;
            }
            if(isVowel(s.charAt(j--))){
                count2++;
            }
        }
        
        return count1==count2;
    }
}