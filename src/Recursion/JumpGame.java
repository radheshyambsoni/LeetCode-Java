package Recursion;

// NOT FINISHED - Excedding Time limit
public class JumpGame {
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
        System.out.println(new JumpGame().canJump(new int[]{1,1,2,4}));
    }
}