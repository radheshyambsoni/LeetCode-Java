package Arrays;
// https://leetcode.com/problems/richest-customer-wealth/
// 1672. Richest Customer Wealth
// Related Topics - Array, Matrix

public class RichestCustomerWealth {
    static int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){
            int tempSum=0;
            for(int j=0;j<accounts[i].length;j++){
                tempSum+=accounts[i][j];
            }
            if(tempSum>maxWealth){maxWealth=tempSum;}
        }
        
        return maxWealth;
    }
    public static void main(String[] args) {
        int accounts[][]={{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
}
