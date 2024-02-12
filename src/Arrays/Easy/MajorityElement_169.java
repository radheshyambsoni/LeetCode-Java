package Arrays.Easy;

// 169. Majority Element
// https://leetcode.com/problems/majority-element/
// Runtime 1 ms Beats 99.82%
// Memory 50.45 MB Beats 47.42%
// Feb 12, 2024

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                ans = nums[i];
            }
            if (nums[i] == ans) {
                cnt++;
            } else {
                cnt--;
            }
        }

        return ans;
    }
}