package Math.Easy;

// https://leetcode.com/problems/count-of-matches-in-tournament/
// Runtime 0 ms Beats 100%
// Memory 39.74 MB Beats 11.90%
// Dec 05, 2023

public class CountOfMatchesInTournament_1688 {
    public int numberOfMatches(int n) {
        int sum = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                sum += (n /= 2);
            } else {
                sum += (n /= 2);
                ++n;
            }
        }

        return sum;
    }
}