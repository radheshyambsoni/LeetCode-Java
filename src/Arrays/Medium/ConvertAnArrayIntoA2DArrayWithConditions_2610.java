package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

// 2610. Convert an Array Into a 2D Array With Conditions
// https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
// Runtime 2 ms Beats 96.82%
// Memory 45.06 MB Beats 9.75%
// Jan 02, 2024

public class ConvertAnArrayIntoA2DArrayWithConditions_2610 {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] freq = new int[nums.length + 1];
        for (int num : nums) {
            freq[num]++;
        }

        List<List<Integer>> ans = new ArrayList<>();
        int isEmpty = 0;
        do {
            isEmpty = 0;
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < nums.length + 1; i++) {
                if (freq[i] > 0) {
                    l.add(i);
                    freq[i]--;
                }
                isEmpty += freq[i];
            }
            ans.add(l);
        } while (isEmpty != 0);

        return ans;
    }
}