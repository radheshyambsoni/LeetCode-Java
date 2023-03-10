package Math.Medium;

// https://leetcode.com/problems/angle-between-hands-of-a-clock/
// Runtime 0 ms Beats 100%
// Memory 39.1 MB Beats 93.16%

public class AngleBWHandsOfClock {
    public double angleClock(int hour,int minutes){
        // 1 hr = 360/12 = 30 degree
        // 1 minute = 360/60 = 6 degree
        // movement of hr hand in proportion to min = min/2
        double hr=hour%12*30 + (double)minutes/2;
        double min=minutes*6;
        double ans=Math.abs(hr-min);

        return ans>180?360-ans:ans;
    }
}
