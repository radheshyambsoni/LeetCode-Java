package Arrays.Medium;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/
// Runtime 15 ms Beats 94.69%
// Memory 52.5 MB Beats 88.20%
// December 27, 2022 - Daily Challenge

public class MaxBagsWithFullCapacityOfRocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=capacity.length;
        for(int i=0;i<n;i++){
            capacity[i]-=rocks[i];
        }
        Arrays.sort(capacity);
        int count=0;
        for(int i=0;i<n;i++){
            if(additionalRocks<capacity[i]){
                break;
            }
            additionalRocks-=capacity[i];
            count++;
        }
        return count;
    }
}