package Strings;
// https://leetcode.com/problems/implement-strstr
// 28. Implement strStr()
public class StrStr {
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0){return 0;}
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        String a="hello";
        String b="lo";
        System.out.println(strStr(a, b));
    }
}
