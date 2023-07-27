package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

// 229. Majority Element II
// https://leetcode.com/problems/majority-element-ii/
// Runtime 2 ms Beats 98.11%
// Memory 47.1 MB Beats 23.12%
// Jul 27, 2023

public class MajorityElement2_229 {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (cnt1 == 0 && el2 != num) {
                cnt1 = 1;
                el1 = num;
            } else if (cnt2 == 0 && el1 != num) {
                cnt2 = 1;
                el2 = num;
            } else if (el1 == num)
                cnt1++;
            else if (el2 == num)
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        int minCnt = nums.length / 3;
        for (int num : nums) {
            if (num == el1)
                cnt1++;
            if (num == el2)
                cnt2++;
        }
        List<Integer> ans = new ArrayList<>();
        if (cnt1 > minCnt)
            ans.add(el1);
        if (cnt2 > minCnt)
            ans.add(el2);

        return ans;
    }
}