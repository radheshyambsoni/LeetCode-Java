package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1630. Arithmetic Subarrays
// https://leetcode.com/problems/arithmetic-subarrays/
// Runtime 20 ms Beats 39.84%
// Memory 44.65 MB Beats 16.48%
// Nov 23, 2023

public class ArithmeticSubarrays_1630 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int[] temp = new int[r[i] - l[i] + 1];
            System.arraycopy(nums, l[i], temp, 0, temp.length);
            Arrays.sort(temp);
            boolean check = true;
            int diff = temp[1] - temp[0];
            for (int j = 2; j < temp.length; j++) {
                if (diff != temp[j] - temp[j - 1]) {
                    check = false;
                    break;
                }
            }

            ans.add(check);
        }

        return ans;
    }
}