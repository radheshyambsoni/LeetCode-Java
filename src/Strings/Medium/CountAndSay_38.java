package Strings.Medium;

// 38. Count and Say
// https://leetcode.com/problems/count-and-say/
// Runtime 6 ms Beats 59.63%
// Memory 40.1 MB Beats 84.19%
// Jul 17, 2023

public class CountAndSay_38 {
    public String countAndSay(int n) {
        String curr="1";        
        while(--n>0){
            int count=1;
            char prev=curr.charAt(0);
            StringBuilder sb=new StringBuilder();
            for(int i=1;i<curr.length();i++){
                if(curr.charAt(i)==prev){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(prev);
                    count=1;
                    prev=curr.charAt(i);
                }
            }
            sb.append(count);
            sb.append(prev);
            curr=sb.toString();
        }
        return curr;
    }
}