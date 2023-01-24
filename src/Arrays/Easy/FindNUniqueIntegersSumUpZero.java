package Arrays.Easy;

import java.util.Arrays;

// 1304. Find N Unique Integers Sum up to Zero
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
// Related Topics - Array, Math

public class FindNUniqueIntegersSumUpZero {
    public static int[] sumZero(int n) {
        int arr[]=new int[n];
        for(int i=0;i<n/2;i++){
            arr[i]=n/2+i;
            arr[n-i-1]=-n/2-i;
        }
        if(n%2!=0){arr[n/2]=0;}
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
}
