package Arrays;

// Runtime 16 ms Beats 95.92%
// Memory 59.9 MB Beats 95.67%
// December 08, 2022
// Daily Challenge - December 04, 2022 - Time Travel Ticket

public class MinAvgDiff{
    public static int minimumAverageDifference(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        // contains the sum[i] till ith index
        int n=nums.length;
        long[] sum=new long[n];
        sum[0]=nums[0];
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+nums[i];
        }

        int min=Integer.MAX_VALUE,temp=0,index=-1;
        for(int i=0;i<n-1;i++){
            temp=(int)Math.abs(sum[i]/(i+1)-(sum[n-1]-sum[i])/(n-i-1));
            if(temp<min){
                min=temp;
                index=i;
            }
        }
        temp=(int)Math.abs(sum[n-1]/(n));
        if(temp<min){
            min=temp;
            index=n-1;
        }
        return index;
    }
    public static void main(String[] args) {
        System.out.println(minimumAverageDifference(new int[]{2,5,3,9,5,3}));
    }
}