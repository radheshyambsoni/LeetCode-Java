package Arrays.Easy;

import java.util.Arrays;

// 1051. Height Checker
// https://leetcode.com/problems/height-checker/
// Runtime 1 ms Beats 91.2%
// Memory 40.4 MB Beats 23.37%
// Feb 25, 2023

public class HeightChecker_1051 {
    public int heightChecker(int[] heights) {
        int[] expected=new int[heights.length];
        System.arraycopy(heights,0,expected,0,heights.length);
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]) count++;
        }
        return count;
    }
}
