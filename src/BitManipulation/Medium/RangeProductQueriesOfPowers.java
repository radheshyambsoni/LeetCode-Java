package BitManipulation.Medium;

import java.util.ArrayList;

// Range Product Queries of Powers
// https://leetcode.com/problems/range-product-queries-of-powers/
// Runtime 63 ms Beats 54.79%
// Memory 134.5 MB Beats 16.44%
// January 25, 2023

public class RangeProductQueriesOfPowers {
    static long MOD=(long)(1e9+7);
    public int[] productQueries(int n, int[][] queries) {
        int[] ans=new int[queries.length];
        int num=n,power=1;
        ArrayList<Integer> p=new ArrayList<>();
        while(num>0){
            if((num&1)==1){
                p.add(power);
            }
            power<<=1;
            num>>=1;
        }
        
        for(int i=0;i<queries.length;i++){
            long prod=1;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                prod=(p.get(j)*prod)%MOD;
            }            
            ans[i]=(int)prod;
        }
        return ans;
    }
}