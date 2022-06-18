public class Jun18_diffOfProdNSumOfDigits {
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
