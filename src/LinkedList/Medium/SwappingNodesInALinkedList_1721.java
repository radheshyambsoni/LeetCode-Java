package LinkedList.Medium;

// 1721. Swapping Nodes in a Linked List
// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
// Runtime 2 ms Beats 99.95%
// Memory 58.1 MB Beats 21.68%
// Mar 18, 2023

public class SwappingNodesInALinkedList_1721 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start=head,end=head;
        for(int i=1;i<k;i++){
            start=start.next;
        }
        ListNode temp=start.next;
        while(temp!=null){
            end=end.next;
            temp=temp.next;
        }
        int val=start.val;
        start.val=end.val;
        end.val=val;
        return head;
    }
}