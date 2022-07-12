package Arrays;

import java.util.List;
import java.util.LinkedList;

// 989. Add to Array-Form of Integer
// https://leetcode.com/problems/add-to-array-form-of-integer/
// Related Topic - Array, Math

public class Add2ArrayFormOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int carry=k;
        LinkedList<Integer> ans=new LinkedList<>();
        for(int i=num.length-1;i>=0;i--){
            int temp=num[i]+carry;
            ans.addFirst(temp%10);
            carry=temp/10;
        }

        while(carry!=0){
            ans.addFirst(carry%10);
            carry/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1,2,0,0},23));
    }
}
