package Strings.Easy;

// 171. Excel Sheet Column Number
// https://leetcode.com/problems/excel-sheet-column-number/
// Related Topics - Math, String

public class ExcelSheetColNum {
    public static int titleToNumber(String columnTitle) {
        int colNum=0;
        for(int i=0;i<columnTitle.length();i++){
            colNum*=26;
            colNum+=columnTitle.charAt(i)-64;
        }
        return colNum;
    }
    public static void main(String[] args) {
        System.out.println(titleToNumber("YYZ"));
    }
}