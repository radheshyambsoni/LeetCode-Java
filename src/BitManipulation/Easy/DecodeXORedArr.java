package BitManipulation.Easy;

// https://leetcode.com/problems/decode-xored-array/
// Runtime 3 ms Beats 68.29%
// Memory 54.7 MB Beats 80.53%

public class DecodeXORedArr{
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0]=first;
        for(int i=0;i<encoded.length;i++){
            arr[i+1]=encoded[i]^arr[i];
        }
        return arr;
    }
}