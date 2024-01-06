package BitManipulation.Medium;

// 260. Single Number III
// https://leetcode.com/problems/single-number-iii/
// Runtime 1 ms Beats 99.88%
// Memory 45.57 MB Beats 20.06%
// Jan 06, 2024

public class SingleNumber3_260 {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int setBit = 0;
        while ((xor & (1 << setBit)) == 0) {
            setBit++;
        }

        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & (1 << setBit)) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        return new int[] { min, max };
    }
}