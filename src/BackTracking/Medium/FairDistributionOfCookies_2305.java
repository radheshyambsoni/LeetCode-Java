package BackTracking.Medium;

// 2305. Fair Distribution of Cookies
// https://leetcode.com/problems/fair-distribution-of-cookies/
// Runtime 421 ms Beats 32.29%
// Memory 39.6 MB Beats 88.2%
// Jul 01, 2023

public class FairDistributionOfCookies_2305 {
    int ans=Integer.MAX_VALUE;
    void f(int[] cookies,int[] candies,int idx){
        if(idx<0){
            int unfairness=0;
            for(int i:candies) unfairness=Math.max(unfairness,i);
            ans=Math.min(ans,unfairness);
            return;
        }

        for(int i=0;i<candies.length;i++){
            candies[i]+=cookies[idx];
            f(cookies,candies,idx-1);
            candies[i]-=cookies[idx];
        }
    }
    public int distributeCookies(int[] cookies, int k) {
        f(cookies, new int[k], cookies.length-1);
        return ans;
    }
}