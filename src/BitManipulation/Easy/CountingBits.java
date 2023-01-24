package BitManipulation.Easy;

import java.util.Arrays;

// https://leetcode.com/problems/counting-bits/
// Runtime 3 ms Beats 77.29%
// Memory 48.1 MB Beats 56.62%

public class CountingBits {
    public static int[] countBits(int n) {
        int[] ans=new int[n+1];
        ans[0]=0;
        int temp;
        for(int i=1;i<=n;i++){
            temp=i;
            while(temp>0){
                ans[i]++;
                temp&=temp-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(6)));
    }
}
