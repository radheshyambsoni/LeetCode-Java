package Math.Easy;

// 1281. Subtract the Product and Sum of Digits of an Integer
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class DiffOfProdNSumOfDigits {
    static int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n>0){
            product*=n%10;
            sum+=n%10;
            n/=10;
        }
        
        return (product-sum);
    }
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(123456));
    }
}
