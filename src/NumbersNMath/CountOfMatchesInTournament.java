package NumbersNMath;

// https://leetcode.com/problems/count-of-matches-in-tournament/ - Easy
// Runtime 0 ms Beats 100%
// Memory 41.4 MB Beats 20.5%
// November 30, 2022

public class CountOfMatchesInTournament{
    public int numberOfMatches(int n) {
        // recursive
        if(n==1){
            return 0;
        }
        if(n%2==0){
            return (n/2)+numberOfMatches(n/2);
        }
        return (n/2)+numberOfMatches((n/2)+1);

        // int sum=0;
        // while(n!=1){
        //     if(n%2==0){
        //         sum+=(n/=2);                
        //     }else{
        //         sum+=(n/=2);
        //         ++n;
        //     }
        // }
        // return sum;
    }
}