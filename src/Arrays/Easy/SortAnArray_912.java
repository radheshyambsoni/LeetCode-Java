package Arrays.Easy;

// 912. Sort an Array
// https://leetcode.com/problems/sort-an-array/
// Runtime 34 ms Beats 62.37%
// Memory 54.1 MB Beats 38.19%
// March 01, 2023

public class SortAnArray_912 {
    void mergeInPlace(int[] arr, int s,int m,int e){
        int[] merged=new int[e-s];
        int i=s,j=m,k=0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                merged[k++]=arr[i++];
            }else{
                merged[k++]=arr[j++];
            }
        }
        while(i<m){            
            merged[k++]=arr[i++];            
        }
        while(j<e){
            merged[k++]=arr[j++];
        }

        for(int l=0;l<merged.length;l++){
            arr[l+s]=merged[l];
        }
    }
    void mergeSortInPlace(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }

        int m=s+(e-s)/2;
        mergeSortInPlace(arr, s, m);
        mergeSortInPlace(arr, m,e);
        
        mergeInPlace(arr, s, m, e);
    }
    public int[] sortArray(int[] nums) {
        mergeSortInPlace(nums,0,nums.length);
        return nums;
    }
}