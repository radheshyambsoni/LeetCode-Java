package BitManipulation;
import java.util.Arrays;

// https://leetcode.com/problems/counting-bits/ - Easy
// Runtime 10 ms Beats 35.35%
// Memory 48.3 MB Beats 38.38%

public class CountingBits {
    public static int[] countBits(int n) {
        int[] ans=new int[n+1];
        ans[0]=0;
        int temp;
        for(int i=1;i<=n;i++){
            temp=i;
            while(temp>0){
                if((temp&1)==1){
                    ans[i]++;
                }
                temp>>=1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(6)));
    }
}
