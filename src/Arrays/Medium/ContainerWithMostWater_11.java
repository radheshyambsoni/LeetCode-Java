package Arrays.Medium;

// 11. Container With Most Water
// https://leetcode.com/problems/container-with-most-water/
// Runtime 4 ms Beats 82.26%
// Memory 55.7 MB Beats 21.96%
// June 25, 2023

public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int max=0, i=0, j=height.length-1;
        while(i<j){
            max=Math.max(max, (j-i)*Math.min(height[i], height[j]));
            if(height[i]<height[j]) i+=1;
            else j-=1;
        }
        return max;
    }
}