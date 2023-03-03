package NumbersNMath.Easy;

// 1323. Maximum 69 Number
// https://leetcode.com/problems/maximum-69-number/
// Runtime 1 ms Beats 73.80%
// Memory 39.7 MB Beats 32.79%
// Mar 03, 2023

public class Max69Num_1323{
    public int maximum69Number(int num) {
        if(num==9 || num==99 || num==999 || num==9999){
            return num;
        }
        char[] n=Integer.toString(num).toCharArray();
        for(int i=0;i<n.length;i++){
            if(n[i]=='6'){
                n[i]='9';
            }
        }
        return Integer.parseInt(String.valueOf(n));
    }
}