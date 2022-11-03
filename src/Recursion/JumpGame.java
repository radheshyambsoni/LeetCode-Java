package Recursion;

// NOT FINISHED - Excedding Time limit
class Solution {
    boolean ans=false;    
    void check(int nums[],int idx){
        if(ans){
            return;
        }
        else if(idx==nums.length-1){
            ans=true;            
            return;
        }else if(nums[idx]==0){
            ans=false;
            return;
        }
        for(int i=1;i<=nums[idx];i++){
            if(ans){break;}
            check(nums,idx+i);
        }
    }
    boolean canJump(int[] nums) {
        check(nums,0);
        return ans;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.canJump(new int[]{1,1,2,4}));
    }
}