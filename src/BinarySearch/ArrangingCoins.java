package BinarySearch;

// 441. Arranging Coins
// https://leetcode.com/problems/arranging-coins/
// Related Topics - Math, Binary Search

public class ArrangingCoins{
    public int arrangeCoins(int n) {        
        return (int)((Math.sqrt(1+8L*n)-1)/2);
    }
}