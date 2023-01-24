package Arrays.Easy;

// 1295. Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Related Topics - Array

public class NumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            if((int)(Math.log10(i))%2!=0){count++;}
        }

        return count;
    }
}
