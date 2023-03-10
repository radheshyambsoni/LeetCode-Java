package Math.Easy;

// https://leetcode.com/problems/three-divisors/
// Runtime 0 ms Beats 100%
// Memory 38.9 MB Beats 96.42%
// December 26, 2022

public class ThreeDivisors{
    public boolean isThree(int n) {
        if(n<=3){return false;}

        int count=2;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                if(count==3){return false;}
                count++;
            }
        }
        return count==3;
    }
}