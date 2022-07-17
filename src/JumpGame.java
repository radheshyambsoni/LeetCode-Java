public class JumpGame{
    static boolean flag=false;
    private static void check(int[] nums,int idx){
        if(idx>=nums.length-1){
            if(idx==nums.length-1){
                flag=true;
                return;
            }
        }
        for(int i=1;i<=nums[idx];i++){
            check(nums,idx+i);
        }
    }
    public static boolean canJump(int[] nums) {
        check(nums,0);
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{0}));
    }
}