import java.util.Arrays;
class Solution{
    public static int[] sortedSquares(int[] nums) {
        int i=0,k=nums.length-1;
        while(k>=0){
            if(k==0){nums[k]*=nums[k--];}
            else if(i==k){i=0;}
            else if(Math.abs(nums[i])==Math.abs(nums[k])){
                i++;
            }else if(Math.abs(nums[i])>Math.abs(nums[k])){
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k--]=temp*temp;
            }else{
                i++;
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        int nums[]={-10000,-9999,-7,-5,5,6,10000};
        // -10000 -9999 -7 -5 0 0 10000
        // k=6,i=0 // -10000 -9999 -7 -5 5 6
        // k=5,i=0 // 6 -9999 -7 -5 5
        // k=4,i=0 // 
        // k=4,i=1 // 0 0 -7 -5
        // k=3,i=1 // 0 0 -7 -5
        // k=3,i=2 // 0 0 -5
        // k=2,i=2 // 
        sortedSquares(nums);
        System.out.println(Arrays.toString(nums));
    }
}

// -5 -3 -2 9
// k=3,i=0
// -5 -3 -2 81
// k=2,i=0
// -2 -3 25 81
// k=1 i=0
// 