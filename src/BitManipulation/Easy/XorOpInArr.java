package BitManipulation.Easy;

// https://leetcode.com/problems/xor-operation-in-an-array/
// Runtime 0 ms Beats 100%
// Memory 41 MB Beats 31.18%

public class XorOpInArr{
    public int xorOperation(int n, int start) {
        int ans=start;
        for(int i=1;i<n;i++){
            ans^=start+2*i;
        }
        return ans;
    }
}