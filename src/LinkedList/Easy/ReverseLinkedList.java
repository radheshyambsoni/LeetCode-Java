package LinkedList.Easy;

// 206. Reverse Linked List
// https://leetcode.com/problems/reverse-linked-list/
// Runtime 0 ms Beats 100%
// Memory 41.3 MB Beats 93.88%
// Jun 13, 2023

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode prev=null, curr=head, next=head.next;
        while(next!=null){
            ListNode temp=next.next;
            next.next=curr;
            curr.next=prev;
            prev=curr;
            curr=next;
            next=temp;
        }
        return curr;
    }
}