package Math.Medium;

// 556. Next Greater Element III
// https://leetcode.com/problems/next-greater-element-iii/
// Runtime 0 ms Beats 100%
// Memory 39 MB Beats 82.10%
// Sep 23, 2023

public class NextGreaterElement3_556 {
    void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }

    void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > idx; i--) {
            if (nums[idx] < nums[i]) {
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverse(nums, idx + 1, n - 1);
    }

    public int nextGreaterElement(int n) {
        if (n < 10)
            return -1;

        int len = 0;
        int num = n;
        while (num > 0) {
            num /= 10;
            len++;
        }

        int[] digits = new int[len];
        num = n;
        while (num > 0) {
            digits[--len] = num % 10;
            num /= 10;
        }

        nextPermutation(digits);

        long ans = 0l;
        for (int i = 0; i < digits.length; i++) {
            ans = ans * 10 + digits[i];
        }

        if (ans > Integer.MAX_VALUE || ans <= n)
            return -1;

        return (int) ans;
    }
}