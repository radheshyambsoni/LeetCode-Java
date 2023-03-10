package Math.Easy;

// 2520. Count the Digits That Divide a Number
// https://leetcode.com/problems/count-the-digits-that-divide-a-number/
// Runtime 0 ms Beats 100%
// Memory 39.5 MB Beats 19.24%
// Feb 28, 2023

public class CountDigitsThatDivideANum_2520 {
    public int countDigits(int num) {
        int n=num,count=0;
        while(n>0){
            if((num%(n%10))==0){
                count++;
            }
            n/=10;
        }
        return count;
    }
}