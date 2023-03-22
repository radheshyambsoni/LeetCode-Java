package Arrays.Easy;

// 2455. Average Value of Even Numbers That Are Divisible by Three
// https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/
// Runtime 0 ms Beats 100%
// Memory 42.9 MB Beats 24.69%

public class AvgValuOfEvenNumsThatRDivisibleBy3_2455 {
    public int averageValue(int[] nums) {
        int sum=0,count=0;
        for(int i:nums){
            if(i%6==0){
                sum+=i;
                count++;
            }
        }
        return sum==0?0:(sum/count);
    }
}