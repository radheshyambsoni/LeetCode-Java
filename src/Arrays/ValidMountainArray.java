// 941. Valid Mountain Array - Easy
// https://leetcode.com/problems/valid-mountain-array/
// Related Topics - Arrays

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<=2){return false;}
        if(arr[1]<=arr[0]){
            return false;
        }
        int i=1;        
        for(;i<arr.length-2;i++){
            if(arr[i+1]==arr[i]){
                return false;
            }
            if(arr[i+1]<arr[i]){
                break;
            }
        }
        for(;i<arr.length-1;i++){
            if(arr[i+1]>=arr[i]){
                return false;
            }
        }
        
        return true;
    }
}
