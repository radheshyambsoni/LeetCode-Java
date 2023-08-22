package Strings.Easy;

// 168. Excel Sheet Column Title
// https://leetcode.com/problems/excel-sheet-column-title/
// Runtime 0 ms Beats 100%
// Memory 39.3 MB Beats 91.43%
// Aug 22, 2023

public class ExcelSheetColumnTitle_168 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            ans.append((char) (65 + columnNumber % 26));
            columnNumber /= 26;
        }
        return ans.reverse().toString();
    }
}