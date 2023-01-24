package Arrays.Easy;

// 1732. Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/
// Related Topics - Array, Prefix Sum

public class FindHighestAltitude{
    public int largestAltitude(int[] gain) {
        int max=0;
        if(gain[0]>max){max=gain[0];}
        for(int i=1;i<gain.length;i++){
            gain[i]+=gain[i-1];
            if(max<gain[i]){max=gain[i];}
        }
        
        return max;
    }
}