package Arrays.Medium;

// 739. Daily Temperatures
// https://leetcode.com/problems/daily-temperatures/
// Runtime 8 ms Beats 99.73%
// Memory 52.1 MB Beats 99.87%
// Decmeber 18, 2022 - Daily Challenge

public class DailyTemperatures_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        int hottest = 0;

        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (temperatures[i] >= hottest) {
                ans[i] = 0;
                hottest = temperatures[i];
            } else {
                // check neighbour
                int days = 1;
                while (temperatures[i + days] <= temperatures[i]) {
                    days += ans[i + days];
                }
                ans[i] = days;
            }
        }

        return ans;
    }
}