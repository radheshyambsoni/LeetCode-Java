package Strings;

// https://leetcode.com/problems/determine-color-of-a-chessboard-square/
// Runtime 0 ms Beats 100%
// Memory 39.9 MB Beats 93.32%

public class ColorOfAChessboardSquare {
    public boolean squareIsWhite(String coordinates) {        
        return ((int)coordinates.charAt(0)+(int)(coordinates.charAt(1)))%2==1;
    }
}
