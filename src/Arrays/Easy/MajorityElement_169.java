package Arrays.Easy;

// 169. Majority Element
// https://leetcode.com/problems/majority-element/
// Related Topics - Array, Hash Table, Divide and Conquer, Sorting, Counting
public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                ans = nums[i];
            }
            if (nums[i] == ans) {
                count++;
            } else {
                count--;
            }
        }

        return ans;
    }
}