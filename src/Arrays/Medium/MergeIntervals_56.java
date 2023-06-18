package Arrays.Medium;

import java.util.Arrays;

// 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/
// Runtime 9 ms Beats 79.60%
// Memory 45.7 MB Beats 77.90%

public class MergeIntervals_56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1) return intervals;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int i=0;
        for(int j=1;j<intervals.length;j++){
            if(intervals[i][1]>=intervals[j][0]){
                intervals[i][1]=Math.max(intervals[i][1],intervals[j][1]);
            }else{
                i++;
                if(i!=j){
                    intervals[i][0]=intervals[j][0];
                    intervals[i][1]=intervals[j][1];
                }
            }
        }

        int[][] ret=new int[i+1][2];
        System.arraycopy(intervals,0,ret,0,i+1);
        return ret;
    }
}