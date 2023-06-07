package BitManipulation.Medium;

// 1318. Minimum Flips to Make a OR b Equal to c
// https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/
// Runtime 0 ms Beats 100%
// Memory 39 MB Beats 98.37%
// June 07, 2023

public class MinFlips2MakeAOrBEqual2C_1318 {
    public int minFlips(int a, int b, int c) {
        String A=Integer.toBinaryString(a);
        String B=Integer.toBinaryString(b);
        String C=Integer.toBinaryString(c);

        int i=A.length()-1,j=B.length()-1,k=C.length()-1;
        int count=0;
        while(k>=0 && i>=0 && j>=0){
            if(C.charAt(k)=='1'){
                if(A.charAt(i)=='0'){
                    if(B.charAt(j)=='0') count++;
                }
            }else{
                if(A.charAt(i)=='1'){
                    if(B.charAt(j)=='1') count+=2;
                    else count++;
                }else{
                    if(B.charAt(j)=='1') count++;
                }
            }
            k--;
            j--;
            i--;
        }

        while(k>=0 && i>=0){
            if(C.charAt(k)=='1'){
                if(A.charAt(i)=='0') count++;
            }else{
                if(A.charAt(i)=='1') count++;
            }
            k--;
            i--;
        }
        while(k>=0 && j>=0){
            if(C.charAt(k)=='1'){
                if(B.charAt(j)=='0') count++;
            }else{
                if(B.charAt(j)=='1') count++;
            }
            k--;
            j--;
        }        
        while(i>=0 && j>=0){
            if(A.charAt(i)=='1'){
                if(B.charAt(j)=='1') count+=2;
                else count++;
            }else{
                if(B.charAt(i)=='1') count++;
            }
            i--;
            j--;
        }

        while(i>=0){
            if(A.charAt(i)=='1') count++;
            i--;
        }
        while(j>=0){
            if(B.charAt(j)=='1') count++;
            j--;
        }
        while(k>=0){
            if(C.charAt(k)=='1') count++;
            k--;
        }

        return count;
    }
}