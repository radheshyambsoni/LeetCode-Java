package Arrays.Medium;

// 2657. Find the Prefix Common Array of Two Arrays
// https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/
// Runtime 2 ms Beats 100%
// Memory 43.8 MB Beats 15.92%
// May 02, 2023

public class FindThePrefixCommonArrOf2Arr_2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        boolean[] hash=new boolean[A.length+1];
        int[] C=new int[A.length];
        int cnt=0;
        for(int i=0;i<C.length;i++){
            if(hash[A[i]]) cnt++;
            else hash[A[i]]=true;

            if(hash[B[i]]) cnt++;
            else hash[B[i]]=true;

            C[i]=cnt;
        }
        return C;
    }
}