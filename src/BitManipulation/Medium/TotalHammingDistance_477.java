package BitManipulation.Medium;

// 477. Total Hamming Distance
// https://leetcode.com/problems/total-hamming-distance/
// Runtime 3 ms Beats 100%
// Memory 45.3 MB Beats 32.94%
// Sep 10, 2023

public class TotalHammingDistance_477 {
    public int totalHammingDistance(int[] nums) {
        int hammingD = 0;
        // Mathematical logic
        // 1. Integer size - 32 bit
        // 2. Hamming distance consider the corresponding bits to be different
        // 3. If set bits count = k -> unset bit count = n - k
        // So, hammingD += k * (n - k) => Done for 0th to 31th bit
        for (int i = 0; i < 32; i++) {
            int setBitCnt = 0;
            for (int j = 0; j < nums.length; j++) {
                setBitCnt += (nums[j] >> i) & 1;
            }
            hammingD += setBitCnt * (nums.length - setBitCnt);
        }

        return hammingD;
    }
}