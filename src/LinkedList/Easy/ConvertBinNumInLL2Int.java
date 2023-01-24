package LinkedList.Easy;

// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
// Runtime 0 ms Beats 100%
// Memory 39.6 MB Beats 94.53%
// December 15, 2022

public class ConvertBinNumInLL2Int {
    public int getDecimalValue(ListNode head) {
        int ans=0;
        while(head!=null){
            ans=ans*2+head.val;
            head=head.next;
        }
        return ans;
    }
}