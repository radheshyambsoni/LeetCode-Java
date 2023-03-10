package Math.Easy;

// https://leetcode.com/problems/alternating-digit-sum/
// Runtime 0 ms Beats 100%
// Memory 41.5 MB Beats 14.29%
// January 22, 2023

public class AlternatingDigitSum{
    public int alternateDigitSum(int n) {
        int count=0;
        int sum=0;
        while(n>0){
            if(count%2==0){
                sum+=n%10;
            }else{
                sum-=n%10;
            }
            n/=10;
            count++;
        }
        if(count%2==0){
            return -sum;
        }
        return sum;
    }
}
