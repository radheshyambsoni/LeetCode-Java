package Arrays.Easy;

// 414. Third Maximum Number
// https://leetcode.com/problems/third-maximum-number/
// Runtime 1 ms Beats 95.52%
// Memory 42.70 MB Beats 89.75%
// Feb 14, 2024

public class ThirdMaxNum_414 {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE, secondM = Integer.MIN_VALUE, thirdM = Integer.MIN_VALUE;
        boolean check = false;
        for (int num : nums) {
            if (num == Integer.MIN_VALUE) {
                check = true;
            }
            if (num > max) {
                thirdM = secondM;
                secondM = max;
                max = num;
            } else if (num < max && num > secondM) {
                thirdM = secondM;
                secondM = num;
            } else if (num < secondM && num > thirdM) {
                thirdM = num;
            }
        }

        return thirdM != secondM && thirdM != max && (check || thirdM != Integer.MIN_VALUE) ? thirdM : max;
    }
}