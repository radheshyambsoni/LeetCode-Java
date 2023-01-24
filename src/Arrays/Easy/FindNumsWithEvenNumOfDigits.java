package Arrays.Easy;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindNumsWithEvenNumOfDigits {
    public int findNumbers(int[] nums) {
        // clever trick is to tackle the range (based on constraints i.e. 1<=nums[i]<=10^5) where the even number of digits number belong
        int count=0;
        for(int i:nums){
            if(i>9 && i<100 || i>999 && i<10000 || i==100000){
                count++;
            }
        }
        return count;
    }
}