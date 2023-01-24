package Arrays.Hard;

import java.util.Collections;
import java.util.HashMap;

// https://leetcode.com/problems/max-points-on-a-line/ - Hard
// Runtime 17 ms Beats 93.65%
// Memory 42.4 MB Beats 77.60%
// January 08, 2023

public class MaxPointsOnALine{
    public int maxPoints(int[][] p) {
        int n=p.length;
        if(n<=2){return n;}

        int max=2;
        HashMap<Double,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){continue;}
                double slope=p[j][0]!=p[i][0]?(1.0*(p[j][1]-p[i][1]))/(p[j][0]-p[i][0]):Integer.MAX_VALUE;
                map.put(slope,map.getOrDefault(slope,1)+1);
            }
            max=Math.max(max,Collections.max(map.values()));
            map.clear();
        }
        return max;
    }
}