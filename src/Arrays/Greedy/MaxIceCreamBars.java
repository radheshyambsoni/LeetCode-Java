package Arrays.Greedy;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-ice-cream-bars/ - Medium
// Runtime 50 ms Beats 45.26%
// Memory 80 MB Beats 9%
// January 06, 2023 - Daily Challenge

public class MaxIceCreamBars{
    public int maxIceCream(int[] costs,int coins){
        Arrays.sort(costs);
        int i=0;
        while(coins>0 && i<costs.length){
            if(costs[i]>coins){break;}
            coins-=costs[i++];
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr={1,6,3,1,2,5};
        System.out.println(new MaxIceCreamBars().maxIceCream(arr, 20));
    }
}