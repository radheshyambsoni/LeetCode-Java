package Arrays;

import java.util.HashMap;
import java.util.ArrayList;

// 697. Degree of an Array - Easy
// https://leetcode.com/problems/degree-of-an-array/
// Related Topics - Array Hash Table
// Runtime: 12 ms, faster than 97.19% of Java online submissions for Degree of an Array.
// Memory Usage: 47.4 MB, less than 88.07% of Java online submissions for Degree of an Array.

public class DegreeOfAnArray{
    public static int findShortestSubArray(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        int i=0,j=nums.length-1;
        while(i<j){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            i++;
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            j--;
        }if(nums.length%2!=0){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }        
        int maxFreq=-1;
        for(int k:hm.keySet()){
            if(hm.get(k)>maxFreq){                
                maxFreq=hm.get(k);
            }
        }
        if(maxFreq==1){return 1;}
        ArrayList<Integer> v=new ArrayList<>();
        for(int k:hm.keySet()){
            if(hm.get(k)==maxFreq){
                v.add(k);
            }
        }
        int minSize=nums.length+1;
        for(int k:v){
            i=0;
            j=nums.length-1;
            while(i<nums.length){
                if(nums[i]==k){
                    break;
                }
                i++;
            }while(j>=0){
                if(nums[j]==k){
                    break;
                }
                j--;
            }
            minSize=Math.min(minSize,j-i+1);
        }
        return minSize;
    }
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1}));
    }
}