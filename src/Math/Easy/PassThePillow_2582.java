package Math.Easy;

// 2582. Pass the Pillow
// https://leetcode.com/problems/pass-the-pillow/
// Runtime 0 ms Beats 100%
// Memory 39 MB Beats 81.47%
// Sep 21, 2023

public class PassThePillow_2582 {
    public int passThePillow(int n, int time) {
        int quo = time / (n - 1);
        int rem = time % (n - 1);
        if (quo % 2 == 1) {
            return n - rem;
        }
        return rem + 1;
    }
}