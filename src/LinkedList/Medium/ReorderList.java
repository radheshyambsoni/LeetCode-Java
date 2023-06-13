package LinkedList.Medium;

// https://leetcode.com/problems/reorder-list/
// Runtime 1 ms Beats 100%
// Memory 46.1 MB Beats 26.67%
// Jun 13, 2023 

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head.next==null){
            return;
        }
        ListNode mid=middleNode(head);
        ListNode head2=reverseList(mid);
        ListNode head1=head;

        // rearrange
        while(head1!=null && head2!=null){
            ListNode temp=head1.next;
            head1.next=head2;
            head1=temp;

            temp=head2.next;
            head2.next=head1;
            head2=temp;
        }
        // setting next of tail to null
        if(head1!=null){
            head1.next=null;
        }
    }
    ListNode middleNode(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode reverseList(ListNode head) {
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