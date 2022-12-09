package Strings;
// 67. Add Binary
// https://leetcode.com/problems/add-binary/ - Easy
// Related Topics - Math, String, Bit Manipulation, Simulation
// Runtime 1 ms Beats 100%
// Memory 40.8 MB Beats 95.91%
// December 08, 2022

public class AddBinary {
    public static String addBinary(String a, String b) {        
        StringBuilder ans=new StringBuilder();
        char[] strA=a.toCharArray(),strB=b.toCharArray();
        
        int carry=0,i=strA.length-1,j=strB.length-1;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum+=strA[i--]-'0';
            }
            if(j>=0){
                sum+=strB[j--]-'0';
            }
            ans.append(sum%2);
            carry=sum/2;
        }
        if(carry==1){
            ans.append(carry);
        }        
        
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(addBinary("111", "111"));
    }
}