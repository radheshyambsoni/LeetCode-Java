package NumbersNMath;

// 70. Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/
// Related Topics - Math, DP, Memorization

public class ClimbingStairs{
    public int climbStairs(int n) {
        if(n==1){return 1;}
        if(n==2){return 2;}
        
        int n1=1,n2=2,ans=0;
        for(int i=3;i<=n;i++){
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
        
        return ans;
    }
}