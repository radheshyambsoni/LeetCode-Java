package Arrays.Medium;

import java.util.PriorityQueue;

// 2462. Total Cost to Hire K Workers
// https://leetcode.com/problems/total-cost-to-hire-k-workers/
// Runtime 64 ms Beats 64.53%
// Memory 57.9 MB Beats 39.49%
// June 26, 2023

public class TotalCost2HireKWorkers_2462 {
    public long totalCost(int[] costs, int k, int candidates) {
        int i=0, j=costs.length-1;
        PriorityQueue<Integer> left=new PriorityQueue<>();
        PriorityQueue<Integer> right=new PriorityQueue<>();

        long ans=0;
        while(k-- >0){
            while(left.size()<candidates && i<= j){
                left.offer(costs[i++]);
            }
            while(right.size()<candidates && i<=j){
                right.offer(costs[j--]);
            }

            int lCost=left.size()>0 ? left.peek() : Integer.MAX_VALUE;
            int rCost=right.size()>0 ? right.peek() : Integer.MAX_VALUE;

            if(lCost<=rCost){
                ans+=lCost;
                left.poll();
            }else{
                ans+=rCost;
                right.poll();
            }
        }
        return ans;
    }
}