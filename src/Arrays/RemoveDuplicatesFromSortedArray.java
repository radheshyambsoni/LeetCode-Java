package Arrays;
// https://leetcode.com/problems/remove-duplicates-from-sorted-array
// 26. Remove Duplicates from Sorted Array
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int slow=1;        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[slow]=nums[i];
                slow++;
            }
        }

        return slow;
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
