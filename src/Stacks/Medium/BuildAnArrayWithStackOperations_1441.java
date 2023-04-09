package Stacks.Medium;

// 1441. Build an Array With Stack Operations
// https://leetcode.com/problems/build-an-array-with-stack-operations/
// Runtime 0 ms Beats 100%
// Memory 42.9 MB Beats 21.43%
// Apr 09, 2023

public class BuildAnArrayWithStackOperations_1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new LinkedList<>();
        int i=1,j=0;
        while(i<=n && j<target.length){
            ans.add("Push");
            if(target[j]!=i){
                ans.add("Pop");
            }else{
                j++;
            }
            i++;
        }
        return ans;
    }
}
