package Arrays;

// https://leetcode.com/problems/decompress-run-length-encoded-list/ - Easy
// Runtime 2 ms Beats 76.84% Memory 48.3 MB Beats 42.35%

public class DecompressRLElist {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0]=first;
        for(int i=0;i<encoded.length;i++){
            arr[i+1]=encoded[i]^arr[i];
        }
        return arr;
    }
}