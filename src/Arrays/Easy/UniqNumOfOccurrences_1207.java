package Arrays.Easy;

// 1207. Unique Number of Occurrences
// https://leetcode.com/problems/unique-number-of-occurrences/
// Runtime 1 ms Beats 99.44%
// Memory 41.86 MB Beats 16.50%
// Jan 17, 2024

public class UniqNumOfOccurrences_1207 {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        for (int num : arr) {
            freq[num + 1000]++;
        }

        boolean[] isUsed = new boolean[2001];
        for (int f : freq) {
            if (f != 0 && isUsed[f]) {
                return false;
            } else if (f != 0) {
                isUsed[f] = true;
            }
        }

        return true;
    }
}