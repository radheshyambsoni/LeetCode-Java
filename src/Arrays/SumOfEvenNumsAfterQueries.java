package Arrays;
import java.util.Arrays;

// https://leetcode.com/problems/sum-of-even-numbers-after-queries/ - Easy
// Daily Challenge Sept 21, 2022
// Runtime: 3 ms, faster than 100.00% of Java online submissions for Sum of Even Numbers After Queries.
// Memory Usage: 50.5 MB, less than 91.32% of Java online submissions for Sum of Even Numbers After Queries.

public class SumOfEvenNumsAfterQueries {
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int ans[]=new int[queries.length];
        int evenSum=0;
        for(int i:nums){
            //better way to check the even number
            if((i&1)==0){
                evenSum+=i;
            }
        }
        for(int i=0;i<queries.length;i++){
            int idx=queries[i][1],val=queries[i][0];
            if((nums[idx]&1)==0){
                evenSum-=nums[idx];
            }
            nums[idx]+=val;

            if((nums[idx]&1)==0){
                evenSum+=nums[idx];
            }
            ans[i]=evenSum;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] ans=sumEvenAfterQueries(new int[]{1,2,3,4},new int[][]{{1,0},{-3,1},{-4,0},{2,3}});
        System.out.println(Arrays.toString(ans));
    }
}