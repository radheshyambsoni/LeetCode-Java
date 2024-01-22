package Arrays.Easy;

// 645. Set Mismatch
// https://leetcode.com/problems/set-mismatch/
// Runtime 1 ms faster than 100.00%
// Memory 43.7 MB 95.67%

public class SetMismatch_645 {
    public int[] findErrorNums(int[] arr) {
        // int i=0;
        // while(i<arr.length){
        // int correctIdx=arr[i]-1;
        // if(arr[i]!=arr[correctIdx]){
        // int temp=arr[i];
        // arr[i]=arr[correctIdx];
        // arr[correctIdx]=temp;
        // }else{
        // i++;
        // }
        // }
        // for(i=0;i<arr.length;i++){
        // if(arr[i]!=i+1){
        // return new int[]{arr[i],i+1};
        // }
        // }
        // return new int[]{-1,-1};

        // Cyclic sort one - not the fastest
        int count[] = new int[arr.length];
        int ans[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - 1]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (count[i] == 2) {
                ans[0] = i + 1;
            }
            if (count[i] == 0) {
                ans[1] = i + 1;
            }
        }
        return ans;
    }
}
