package Arrays.Medium;

// 1535. Find the Winner of an Array Game
// https://leetcode.com/problems/find-the-winner-of-an-array-game/
// Runtime 0 ms Beats 100.00%
// Memory 57.22 MB Beats 18.12%
// Nov 05, 2023

public class FindTheWinnerOfAnArrayGame_1535 {
    public int getWinner(int[] arr, int k) {
        int win = arr[0], cnt = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > win) {
                win = arr[i];
                cnt = 1;
            } else {
                cnt++;
            }

            if (cnt == k)
                return win;
        }

        return win;
    }
}