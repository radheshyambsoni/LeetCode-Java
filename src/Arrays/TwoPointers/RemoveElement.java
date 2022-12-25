// Took too manys submissions - try to resolve
package Arrays.TwoPointers;
// 27. Remove Element
// https://leetcode.com/problems/remove-element/
// Related Topics - Arrays Two Pointers

public class RemoveElement{
    public static int removeElement(int[] nums, int val) {
        if(val>50){return (nums.length-1);}
        if(nums.length==0){
            return 0;
        }
        int i=0,j=nums.length-1;
        while(i<=j){
            while(j>=0 && nums[j]==val){j--;}
            if(i>j){break;}
            if(nums[i]==val){
                nums[i]=nums[j];
                nums[j]=val;
            }
            i++;
        }
        return j+1;
    }
    public static void main(String[] args) {
        int nums[]={3};
        int k=removeElement(nums,3);
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}