package Arrays;
import java.util.HashSet;

// 41. First Missing Positive - Hard
// https://leetcode.com/problems/first-missing-positive/
// Related Topics - Array Hash Table
// Runtime: 28 ms, faster than 22.13% of Java online submissions for First Missing Positive.
// Memory Usage: 68.3 MB, less than 100.00% of Java online submissions for First Missing Positive.

public class FirstMissingPositive{
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){hs.add(nums[i]);}
        }
        int i=1;
        for(;i<Integer.MAX_VALUE;i++){
            if(!hs.contains(i)){
                break;
            }
        }
        return i;
    }
}