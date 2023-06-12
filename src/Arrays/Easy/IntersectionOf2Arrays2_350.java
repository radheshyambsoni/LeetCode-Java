package Arrays.Easy;

import java.util.List;
import java.util.LinkedList;

// 350. Intersection of Two Arrays II
// https://leetcode.com/problems/intersection-of-two-arrays-ii/
// Runtime 1 ms Beats 98.36%
// Memory 43.9 MB Beats 7.49%
// Jun 12, 2023

public class IntersectionOf2Arrays2_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq=new int[1001];
        for(int i:nums1) freq[i]++;
        List<Integer> l=new LinkedList<>();
        for(int i:nums2){
            if(freq[i]-->0) l.add(i);
        }        
        int[] ret=new int[l.size()];
        int j=0;
        for(int i:l){
            ret[j++]=i;
        }
        return ret;
    }
}
