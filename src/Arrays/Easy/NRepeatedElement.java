package Arrays.Easy;

import java.util.HashMap;

// 961. N-Repeated Element in Size 2N Array
// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

public class NRepeatedElement {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        for(int i:hm.keySet()){
            if(hm.get(i)==nums.length/2){
                return i;
            }
        }
        
        return -1;
    }
}
