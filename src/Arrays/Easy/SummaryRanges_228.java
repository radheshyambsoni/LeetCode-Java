package Arrays.Easy;

// 228. Summary Ranges
// https://leetcode.com/problems/summary-ranges/description/
// Runtime 5 ms Beats 83.94%
// Memory 40.8 MB Beats 73.61%
// Jun 12, 2023

public class SummaryRanges_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new LinkedList<>();
        int i=0,j=1;
        while(i<nums.length-1 && j<nums.length){
            if(j<=nums.length-1 && nums[j]-nums[j-1]==1) j++;
            else{
                if(j-i<=1){
                    ans.add(""+nums[i]);
                }else{
                    ans.add(nums[i]+"->"+nums[j-1]);
                }
                i=j;
                j++;
            }
        }
        if(j==nums.length){
            if(i==nums.length-1){
                ans.add(""+nums[i]);
            }else{
                ans.add(nums[i]+"->"+nums[j-1]);
            }
        }
        return ans;
    }
}
