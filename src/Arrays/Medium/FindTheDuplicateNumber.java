package Arrays.Medium;

// 287. Find the Duplicate Number
// https://leetcode.com/problems/find-the-duplicate-number/
// Runtime 1 ms Beats 100%
// Memory 57.7 MB Beats 15.74%
// Sep 19, 2023

// O(n) space
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] hash = new boolean[n + 1];
        for (int num : nums) {
            if (hash[num])
                return num;
            else
                hash[num] = true;
        }

        return -1;
    }
}

// public class FindTheDuplicateNumber {
// public int findDuplicate(int[] nums) {
// // December 06, 2022
// // Linked List cycle detection method - where the start of cycle is our
// duplicate element
// // cycle detection
// int slow = nums[0];
// int fast = nums[0];
// do {
// slow = nums[slow];
// fast = nums[nums[fast]];
// } while (slow != fast);

// // cycle start detection
// fast = nums[0];
// while (slow != fast) {
// slow = nums[slow];
// fast = nums[fast];
// }
// return slow;
// }
// }