package Arrays.Medium;

// 80. Remove Duplicates from Sorted Array II
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Runtime 0 ms Beats 100%
// Memory 43.7 MB Beats 82.14%
// Jul 18, 2023

public class RemoveDuplicatesFromSortedArr2_80 {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1, cnt = 1;
        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
                cnt = 1;
            } else if (cnt == 1) {
                nums[++i] = nums[j];
                cnt = 2;
            }
            j++;
        }
        return i + 1;
    }
}