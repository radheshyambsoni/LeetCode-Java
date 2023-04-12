package Stacks.Medium;

// 71. Simplify Path
// https://leetcode.com/problems/simplify-path/
// Runtime 3 ms Beats 98.32%
// Memory 42.3 MB Beats 91.77%
// Apr 12, 2023

public class SimplifyPath_71 {
    public String simplifyPath(String path) {
        Deque<String> d=new ArrayDeque<>();
        for(String p:path.split("/")){
            if(!d.isEmpty() && p.equals("..")){
                d.removeLast();
            }else if(!p.equals(".") &&  !p.equals("") && !p.equals("..")){
                d.addLast(p);
            }
        }

        StringBuilder sb=new StringBuilder();
        for(String s:d){
            sb.append("/").append(s);
        }
        return sb.length()==0?"/":sb.toString();
    }
}
