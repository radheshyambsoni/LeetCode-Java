package Arrays;

import java.util.ArrayList;
import java.util.List;

// 119. Pascal's Triangle II
// https://leetcode.com/problems/pascals-triangle-ii/
// Related Topics - Arrays, DP

public class PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        long prev=1;
        ans.add(1);
        for(int i=1;i<=rowIndex;i++){
            long curr=(prev*(rowIndex-i+1))/i;
            ans.add((int)curr);
            prev=curr;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getRow(13));
    }
}