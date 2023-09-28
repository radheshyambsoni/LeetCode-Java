package Math.Easy;

// 258. Add Digits
// https://leetcode.com/problems/add-digits/
// Runtime 1 ms beats 100.00%
// Memory 41.8 MB beats 24.06%

public class AddDigits_258 {
    public int addDigits(int num) {
        int ans = 0;
        while (num != 0) {
            ans += num % 10;
            num /= 10;
            if (ans >= 10 && num == 0) {
                num = ans;
                ans = 0;
            }
        }
        return ans;
    }
}
