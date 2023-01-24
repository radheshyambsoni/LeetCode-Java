package Arrays.Easy;

// https://leetcode.com/problems/richest-customer-wealth/
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Richest Customer Wealth.
// Memory Usage: 43.1 MB, less than 70.41% of Java online submissions for Richest Customer Wealth.

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxSum=0;
        for(int i=0;i<accounts.length;i++){
            int tempSum=0;
            for(int j=0;j<accounts[0].length;j++){
                tempSum+=accounts[i][j];
            }
            maxSum=tempSum>maxSum?tempSum:maxSum;
        }
        return maxSum;
    }
}
