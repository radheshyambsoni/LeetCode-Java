package Strings;

// 709. To Lower Case
// https://leetcode.com/problems/to-lower-case/
// Related Topics - String
// Runtime: 1 ms, faster than 80.26% of Java online submissions for To Lower Case.
// Memory Usage: 41.6 MB, less than 83.80% of Java online submissions for To Lower Case.

public class ToLowerCase {
    public String toLowerCase(String s) {
        char ans[]=s.toCharArray();
        for(int i=0;i<ans.length;i++){
            if(ans[i]>='A' && ans[i]<='Z'){
                ans[i]=(char)(ans[i]+32);
            }
        }
        
        return String.valueOf(ans);
        // I came to know about the above function newly
    }
}