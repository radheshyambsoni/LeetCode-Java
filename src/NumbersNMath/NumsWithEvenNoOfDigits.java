package NumbersNMath;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// 1295. Find Numbers with Even Number of Digits
public class NumsWithEvenNoOfDigits {
    static public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            if((int)(Math.log10(i))%2!=0){count++;}
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[]={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
}
