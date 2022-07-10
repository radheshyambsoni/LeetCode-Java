package Arrays;

import java.util.HashMap;

// 1512. Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/
// Related Topics - Array, Hash Table, Math, Sorting

// Optimised solution came using the hint - Count how many times each number appears. If a number appears n times, then n * (n – 1) // 2 good pairs can be made with this number.

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i:nums){
            h1.put(i,h1.getOrDefault(i, 0)+1);
        }
        int count=0;
        for(int i:h1.values()){
            count+=i*(i-1)/2;
        }

        return count;
    }
}
