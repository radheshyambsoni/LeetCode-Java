package Arrays.Easy;

import java.util.Arrays;

// 88. Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/
// Related Topics - Arrays, Two pointers, Sorting

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;n--;
        while(m>=0 && n>=0){
            if(nums1[m]>nums2[n]){
                nums1[m+n+1]=nums1[m--];
            }else{
                nums1[m+n+1]=nums2[n--];
            }
        }while(m>=0){
            nums1[m+n+1]=nums1[m--];
        }while(n>=0){
            nums1[m+n+1]=nums2[n--];
        }
    }
    public static void main(String[] args) {
        int nums1[]={7,8,9,0,0,0};
        int nums2[]={2,4,5};
        merge(nums1,3, nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}