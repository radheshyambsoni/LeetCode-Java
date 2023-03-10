package Math.Easy;

// 504. Base 7
// https://leetcode.com/problems/base-7/
// Runtime 1 ms Beats 86.65%
// Memory 39.9 MB Beats 58.90%
// Feb 27, 2023

public class Base7_504 {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        
        boolean sign=num>0?false:true;
        num=Math.abs(num);
        StringBuilder sb=new StringBuilder();
        while(num>0){
            sb.append(num%7);
            num/=7;
        }
        if(sign) sb.append("-");
        return sb.reverse().toString();
    }
}
