package Arrays;

import java.util.HashMap;
import java.util.HashSet;

// https://leetcode.com/problems/unique-number-of-occurrences/ - Easy
// Runtime 4 ms Beats 67.10%
// Memory 42.2 MB Beats 43.92%
// still scope of improvement
// Daily LeetCode Challenge - November 30, 2022

public class UniqueNumOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(Integer i:map.values()){
            if(!set.add(i)){
                return false;
            }
        }
        return true;
    }
}