package Arrays.Easy;

import java.util.ArrayList;

// 349. Intersection of Two Arrays
// https://leetcode.com/problems/intersection-of-two-arrays/
// Runtime 1 ms Beats 99.36%
// Memory 42 MB Beats 96.21%

public class IntersectionOf2Arr {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> l=new ArrayList<>();
        boolean[] freq=new boolean[1001];
        for(int i:nums1){
            freq[i]=true;
        }
        for(int i:nums2){
            if(freq[i]){
                freq[i]=false;
                l.add(i);
            }
        }
        int[] ans=new int[l.size()];
        int j=0;
        for(int i:l){
            ans[j++]=i;
        }
        return ans;
    }
}