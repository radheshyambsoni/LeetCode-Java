package Arrays.Easy;

// 2485. Find the Pivot Integer
// https://leetcode.com/problems/find-the-pivot-integer/
// Runtime 1 ms Beats 85.11%
// Memory 39.8 MB Beats 32.55%
// March 01, 2023

public class FindThePivotInteger_2485 {
    public int pivotInteger(int n) {
        int rightSum=0;
        for(int i=1;i<=n;i++){
            rightSum+=i;
        }
        
        int leftSum=1;
        for(int i=1;i<=n;i++){
            if(leftSum==rightSum){
                return i;
            }else{
                if(i==n){rightSum=0;}
                else{rightSum-=i+1;}
                leftSum+=i;
            }
        }
        return -1;
    }
}