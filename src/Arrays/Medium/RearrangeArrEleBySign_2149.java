package Arrays.Medium;

// 2149. Rearrange Array Elements by Sign
// https://leetcode.com/problems/rearrange-array-elements-by-sign/
// Runtime 3 ms Beats 100.00%
// Memory 85.27 MB Beats 9.23%
// Feb 14, 2024

public class RearrangeArrEleBySign_2149 {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int posIdx = 0, negIdx = 1;
        for (int num : nums) {
            if (num > 0) {
                ans[posIdx] = num;
                posIdx += 2;
            } else {
                ans[negIdx] = num;
                negIdx += 2;
            }
        }

        return ans;
    }
}