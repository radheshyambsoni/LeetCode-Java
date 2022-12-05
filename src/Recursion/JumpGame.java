package Recursion;

// NOT FINISHED - Excedding Time limit
class Solution {
    public boolean canJump(int[] nums) {
        return check(nums,0);
    }
    public boolean check(int[] nums, int index){
        if(index>=nums.length-1){
            return true;
        }
        for(int i=nums[index];i>=1;i--){
            if(check(nums, i+index)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.canJump(new int[]{1,1,2,4}));
    }
}