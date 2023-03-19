package LinkedList.Medium;

// 24. Swap Nodes in Pairs
// https://leetcode.com/problems/swap-nodes-in-pairs/
// Runtime 0 ms Beats 100%
// Memory 39.9 MB Beats 70.70%
// Mar 19, 2023

public class SwapNodesInPairs_24 {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd=head,even=head.next;
        head=even;
        ListNode nextOdd=null,nextEven=null;
        while(odd!=null && even!=null){
            nextOdd=even.next;
            nextEven=nextOdd==null?null:nextOdd.next;
            even.next=odd;
            odd.next=nextEven==null?nextOdd:nextEven;
            odd=nextOdd;
            even=nextEven;
        }
        return head;
    }
}