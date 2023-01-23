package Strings.Easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/description/ - Easy
// Runtime 1 ms Beats 100%
// Memory 42.8 MB Beats 98.15%

public class CellsInRangeOnExcelSheet{
    public List<String> cellsInRange(String s) {
        List<String> ans=new ArrayList<>();        
        for(char col=s.charAt(0);col<=s.charAt(3);col++){
            char[] i={col,'0'};
            for(char row=s.charAt(1);row<=s.charAt(4);row++){
                i[1]=row;
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}