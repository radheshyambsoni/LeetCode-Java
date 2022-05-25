public class May24_MaxSubArraySum {
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
        int nums[]={-1,-2,-3,4};
        System.out.println(maxSubArray(nums));
    }
}
