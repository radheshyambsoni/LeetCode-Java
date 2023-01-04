package Arrays.Greedy;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/ - Medium
// Runtime 16 ms Beats 95.13%
// Memory 100.1 MB Beats 55.65%
// January 04, 2023

public class MinRounds2FinishAllTasks{
    public int minimumRounds(int[] tasks){
        Arrays.sort(tasks);
        int count = 0;
        for(int i=0;i<tasks.length;){
            int j=i+1;
            while(j<tasks.length && tasks[j]==tasks[i]) j++;
            if(j==i+1) return -1;
            if((j-i)%3==0){
                count+=i/3;
            }else{
                count+=(i/3)+1;
            }
            i = j;
        }
        return count;
    }
}