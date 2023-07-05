package Arrays.Medium;

import java.util.Arrays;

// 2126. Destroying Asteroids
// https://leetcode.com/problems/destroying-asteroids/
// Runtime 25 ms Beats 92.45%
// Memory 57.4 MB Beats 44.60%

public class DestroyingAsteroids_2126 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {        
        long m=mass;
        Arrays.sort(asteroids);
        // 3 5 9 19 21
        for(int i=0;i<asteroids.length;i++){
            if(m<asteroids[i]) return false;
            if(asteroids[asteroids.length-1]<=m) return true;
            m+=asteroids[i];
        }
        return true;
    }
}