package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// 1389. Create Target Array in the Given Order
// https://leetcode.com/problems/create-target-array-in-the-given-order/
// Related Topics - Array, Simulation

public class CreateTargetArrayInGivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> al=new ArrayList<>(nums.length);
        for(int i=0;i<nums.length;i++){
            al.add(index[i],nums[i]);
        }
        int[] target=new int[nums.length];
        int i=0;
        for(int val:al){
            target[i++]=val;
        }
        return target;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createTargetArray(new int[]{0,1,2,3,4},new int[]{0,1,2,2,1})));
    }
}