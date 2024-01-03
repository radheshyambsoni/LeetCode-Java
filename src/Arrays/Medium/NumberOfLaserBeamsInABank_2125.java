package Arrays.Medium;

// 2125. Number of Laser Beams in a Bank
// https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
// Runtime 11 ms Beats 92.06%
// Memory 45.13 MB Beats 15.28%
// Jan 03, 2024

public class NumberOfLaserBeamsInABank_2125 {
    public int numberOfBeams(String[] bank) {
        int total = 0, prevCnt = 0;
        for (String r : bank) {
            int currCnt = 0;
            for (char c : r.toCharArray()) {
                if (c == '1') {
                    currCnt++;
                }
            }
            if (currCnt == 0) {
                continue;
            }

            total += currCnt * prevCnt;
            prevCnt = currCnt;
        }

        return total;
    }
}