import java.util.Arrays;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int start=0,end=numbers.length-1;
        int mid=start+(end-start)/2;
        while(start<end){
            if(numbers[mid]>target){
                end=mid-1;
                mid=start+(end-start)/2;
            }else{
                start=mid+1;
                mid=start+(end-start)/2;
            }
        }
        System.out.println(end);
        System.out.println(start);
        for(int i=1;i<=end;i++){
            for(int j=i;j<=end;j++){
                if(numbers[j-i]+numbers[j]==target){
                    return new int[]{j-i+1, j+1};
                }
            }            
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{-1,0,1,2},-1)));
        // twoSum(new int[]{2,7,11,13,15},11);
    }
}