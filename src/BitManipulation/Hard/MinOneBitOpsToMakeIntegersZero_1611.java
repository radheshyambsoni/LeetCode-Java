package BitManipulation.Hard;

// 1611. Minimum One Bit Operations to Make Integers Zero
// https://leetcode.com/problems/minimum-one-bit-operations-to-make-integers-zero/
// Runtime 0 ms Beats 100.00%
// Memory 39.57 MB Beats 33.66%
// Nov 30, 2023

public class MinOneBitOpsToMakeIntegersZero_1611 {
    public int minimumOneBitOperations(int n) {
        // https://youtu.be/IsOnFlNy61Y?si=D1SQThJI3re0kxby
        int ans = 0;
        boolean flag = true;
        for (int i = 31; i >= 0; i--) {
            if (((n >> i) & 1) == 1) {
                if (flag) {
                    ans += (1 << (i + 1)) - 1;
                    flag = false;
                } else {
                    ans -= ((1 << (i + 1)) - 1);
                    flag = true;
                }
            }
        }

        return ans;
    }
}