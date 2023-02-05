package Arrays.Easy;

// 1394. Find Lucky Integer in an Array
// https://leetcode.com/problems/find-lucky-integer-in-an-array/
// Runtime 1 ms Beats 100%
// Memory 41.8 MB Beats 71.36%
// February 04, 2023

public class FindLuckyIntInAnArr {
    public int findLucky(int[] arr) {
        int[] freq=new int[501];
        for(int i:arr){
            freq[i]++;
        }
        for(int i=freq.length-1;i>0;i--){
            if(freq[i]==i){
                return i;
            }
        }
        return -1;
    }
}