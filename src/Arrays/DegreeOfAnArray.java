package Arrays;

// 697. Degree of an Array-Easy
// https://leetcode.com/problems/degree-of-an-array/
// Related Topics-Array Hash Table
// Runtime: 2 ms, faster than 100.00% of Java online submissions for Degree of an Array.
// Memory Usage: 47.1 MB, less than 89.11% of Java online submissions for Degree of an Array.

public class DegreeOfAnArray{
    public static int findShortestSubArray(int[] nums){
        int size=0;
        for(int i:nums){
            size=Math.max(size,i);
        }

        int[] count=new int[size+1];
        int[] startIdx=new int[size+1];
        int[] lastIdx=new int[size+1];

        int max=1;
        for(int i=0;i<nums.length;i++){            
            count[nums[i]]++;
            max=Math.max(max,count[nums[i]]);
            if(startIdx[nums[i]]==0){
                startIdx[nums[i]]=i+1;
            }
            lastIdx[nums[i]]=i+1;
        }

        int minSize=Integer.MAX_VALUE;
        for(int i=0;i<count.length;i++){
            if(count[i]==max){
                minSize=Math.min(minSize,lastIdx[i]-startIdx[i]+1);
            }
        }
        return minSize;
    }
    public static void main(String[] args){
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1}));
    }
}