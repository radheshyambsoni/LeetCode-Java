package Strings.Medium;

// 2405. Optimal Partition of String
// https://leetcode.com/problems/optimal-partition-of-string/
// Runtime 14 ms Beats 77.74%
// Memory 43.2 MB Beats 53%
// Apr 04, 2023

public class OptimalPartitionOfString_2405 {
    public int partitionString(String s) {
        int i=0,count=1;
        int[] freq=new int[26];
        while(i<s.length()){
            int idx=s.charAt(i)-'a';
            if(freq[idx]!=0){
                count++;
                Arrays.fill(freq,0);
            }
            freq[idx]++;
            i++;
        }
        return count;
    }
}
