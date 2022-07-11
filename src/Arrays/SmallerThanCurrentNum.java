package Arrays;

import java.util.Arrays;

// 1365. How Many Numbers Are Smaller Than the Current Number
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
// Related Topics - Array, Hash Table, Sorting, Counting

public class SmallerThanCurrentNum {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=nums.clone();
        Arrays.sort(ans);
        for(int idx=0;idx<nums.length;idx++){
            int count=0;
            for(int i=0;i<ans.length;i++){
                if(ans[i]==nums[idx]){break;}
                count++;
            }
            nums[idx]=count;
        }

        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{1,5,4,3})));
    }
}