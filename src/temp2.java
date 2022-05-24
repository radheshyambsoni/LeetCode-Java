public class temp2 {
    public static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE,maxEndingHere=0;
        for(int i=0;i<nums.length;i++){
            maxEndingHere+=nums[i];
            if(maxEndingHere>maxSum){maxSum=maxEndingHere;}
            if(maxEndingHere<0){maxEndingHere=0;}
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[]={-2,-1,-2,5};
        System.out.println(maxSubArray(nums));
    }
}
