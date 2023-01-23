package Strings.Easy;

// 168. Excel Sheet Column Title
// https://leetcode.com/problems/excel-sheet-column-title/
// Related Topics - Math, String

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder ans=new StringBuilder("");        
        while(columnNumber>0){
            columnNumber--;
            ans.append((char)(65+columnNumber%26));
            columnNumber/=26;
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }
}