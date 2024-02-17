package Arrays.Medium;

// 1010. Pairs of Songs With Total Durations Divisible by 60
// https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/description/
// Runtime 2 ms Beats 97.43%
// Memory 53.19 MB Beats 29.26%
// Feb 17, 2024

public class PairsOfSongsWithTotalDurationsDivisibleBy60_1010 {
    public int numPairsDivisibleBy60(int[] time) {
        long[] freq = new long[60];
        for (int t : time) {
            freq[t % 60]++;
        }

        long cnt = 0;
        cnt += freq[0] * (freq[0] - 1) / 2;
        cnt += freq[30] * (freq[30] - 1) / 2;
        for (int i = 1; i < 30; i++) {
            cnt += freq[i] * freq[60 - i];
        }

        return (int) cnt;
    }
}