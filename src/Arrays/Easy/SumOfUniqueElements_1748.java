package Arrays.Easy;

// 1748. Sum of Unique Elements
// https://leetcode.com/problems/sum-of-unique-elements/
// Runtime 0 ms Beats 100%
// Memory 40.3 MB Beats 62.22%

public class SumOfUniqueElements_1748 {
    public int sumOfUnique(int[] nums) {
        int[] map = new int[101];
        int sum = 0;
        for (int num : nums) {
            map[num]++;
        }
        for (int num : nums) {
            if (map[num] == 1) {
                sum += num;
            }
        }

        return sum;
    }
}