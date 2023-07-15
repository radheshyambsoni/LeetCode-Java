package BackTracking.Easy;

import java.util.ArrayList;
import java.util.List;

// 401. Binary Watch
// https://leetcode.com/problems/binary-watch/
// Runtime 0 ms Beats 100%
// Memory 41.3 MB Beats 73.13%
// Jul 15, 2023

public class BinaryWatch_401 {
    public List<String> readBinaryWatch(int turnedOn) {
        if(turnedOn>8) return new ArrayList<>();        
        List<String> ans=new ArrayList<>();
        int[] hrs={0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3};        
        for(int h=0;h<12;h++){
            int n=turnedOn-hrs[h];
            if(n>=0){
                for(int m=0;m<60;m++){
                    if(Integer.bitCount(m) == n) ans.add(buildString(h,m));
                }
            }
        }
        return ans;
    }
    String buildString(int h, int m){
        StringBuilder sb=new StringBuilder();
        sb.append(h);
        sb.append(":");
        if(m<10) sb.append(0);
        sb.append(m);
        return sb.toString();
    }
}