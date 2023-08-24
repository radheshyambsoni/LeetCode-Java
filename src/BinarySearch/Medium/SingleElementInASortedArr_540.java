package BinarySearch.Medium;

// 540. Single Element in a Sorted Array
// https://leetcode.com/problems/single-element-in-a-sorted-array/
// Runtime 0 ms Beats 100%
// Memory 49.8 MB Beats 70.69%
// Aug 24, 2023

public class SingleElementInASortedArr_540 {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        // OBSERVATION
        // on left of single elmennt - duplicate pairs have indices like this - (even,
        // odd)
        // on right of single elmennt - duplicate pairs have indices like this - (odd,
        // even)

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];

            // mid is odd & nums[mid-1] == nums[mid] -> mid is on left half
            // -> left half is to be eliminated
            // OR
            // mid is even & nums[mid] == nums[mid + 1] -> mid is on left half
            // -> again left half is to be eliminated
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) ||
                    (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1;
            }
            // otherwise we're on right half and have to go on left half
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}