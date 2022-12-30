package Strings;
// https://leetcode.com/problems/defanging-an-ip-address/ - Easy
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
// Memory Usage: 41.3 MB, less than 82.94% of Java online submissions for Defanging an IP Address.

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if(ch=='.'){
                s.append("[.]");
            }else{
                s.append(ch);
            }
        }
        return s.toString();
    }
}