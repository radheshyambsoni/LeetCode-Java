package BitManipulation.Medium;

// https://leetcode.com/problems/find-the-original-array-of-prefix-xor/
// Runtime 1 ms Beats 100%
// Memory 55.6 MB Beats 71.58%
// December 31, 2022

public class FindTheOriginalArrOfPrefixXor {
    public int[] findArray(int[] pref) {
        for(int i=pref.length-1;i>0;i--){
            pref[i]^=pref[i-1];
        }
        return pref;
    }
}