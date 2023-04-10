package LinkedList.Medium;

// 2095. Delete the Middle Node of a Linked List
// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
// Runtime 4 ms Beats 76.49%
// Memory 68.5 MB Beats 43.68%
// Apr 10, 2023

public class DeleteTheMiddleNodeOfALinkedList_2095 {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode temp=null,slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
