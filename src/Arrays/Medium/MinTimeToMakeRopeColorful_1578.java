package Arrays.Medium;

// 1578. Minimum Time to Make Rope Colorful
// https://leetcode.com/problems/minimum-time-to-make-rope-colorful/
// Runtime 7 ms Beats 88.95%
// Memory 60.38 MB Beats 20.57%
// Dec 27, 2023

public class MinTimeToMakeRopeColorful_1578 {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();

        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                ans += Math.min(neededTime[i], neededTime[i - 1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }

        return ans;
    }
}