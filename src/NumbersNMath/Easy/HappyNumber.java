package NumbersNMath.Easy;

// https://leetcode.com/problems/happy-number/
// Runtime 1 ms Beats 98.15%
// Memory 41.1 MB Beats 56.55%
// Related Topics - Hash Table, Math, Two Pointers

// December 02, 2022

public class HappyNumber {
    // two pointer approach
    // same approach as linked list cycle detection
    public boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow=sumOfSquares(slow);
            fast=sumOfSquares(sumOfSquares(fast));
        }while(slow!=fast);
        
        return slow==1;
    }
    private int sumOfSquares(int num){
        int ans=0;
        while(num>0){
            int digit=num%10;
            ans+=digit*digit;
            num/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(18));
    }
}