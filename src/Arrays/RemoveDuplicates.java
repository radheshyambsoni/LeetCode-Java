package Arrays;
// https://leetcode.com/problems/remove-duplicates-from-sorted-array
// 26. Remove Duplicates from Sorted Array
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int idx=0;
        int temp=-101;
        for(int i=0;i<nums.length;i++){
            if(temp!=nums[i]){
                temp=nums[i];
                nums[idx]=nums[i];
                idx++;
            }
        }

        return idx;
    }
    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums ={0,1,2,3,4}; // The expected answer with correct length
        
        int k = removeDuplicates(nums); // Calls your implementation
        
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]+" ");
            assert nums[i] == expectedNums[i];
        }
    }
}
