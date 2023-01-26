package BinarySearch.Easy;

// 441. Arranging Coins
// https://leetcode.com/problems/arranging-coins/
// Related Topics - Math, Binary Search

public class ArrangingCoins{
    public int arrangeCoins(int n) {        
        // (k*(k+1))/2 - sum of first k natural nums
        // returning the root of the above quadratic eqn.
        return (int)(Math.sqrt(2*(long)n+0.25)-0.5);
    }
}