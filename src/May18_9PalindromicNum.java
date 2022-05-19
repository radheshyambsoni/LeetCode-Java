import java.util.Scanner;
public class May18_9PalindromicNum {
    // Given an integer x, return true if x is palindrome integer.
    // An integer is a palindrome when it reads the same backward as forward.
    // For example, 121 is a palindrome while 123 is not.
    // Follow up: Could you solve it without converting the integer to a string?
    
    public static boolean isPalindrome(int x) {
        if(x<0){return false;}
        
        int size=(int)Math.log10(x)+1;
        if(size==1){return true;}
        int ans=0;
        
        for(int i=0;i<size/2;i++){
            ans=ans*10+x%10;
            x/=10;
        }
        
        if(size%2==1){x/=10;}
        if(x==ans){return true;}
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        System.out.println(isPalindrome(n));
    }
}
