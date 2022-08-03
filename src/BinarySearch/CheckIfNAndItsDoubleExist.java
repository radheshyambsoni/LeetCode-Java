// 1346. Check If N and Its Double Exist - Easy
// https://leetcode.com/problems/check-if-n-and-its-double-exist/
// Related Topics - Array, Hash Table, Two Pointers, Binary Search, Sorting

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        int idx=0;
        while(idx<arr.length){
            for(int i=0;i<idx;i++){
                if(arr[i]==2*arr[idx]){
                    return true;
                }
            }
            for(int i=idx+1;i<arr.length;i++){
                if(arr[i]==2*arr[idx]){
                    return true;
                }
            }
            idx++;
        }
        return false;
    }    
}
