package LinkedList;

// https://leetcode.com/problems/reorder-list/ - Medium
// Runtime 2 ms Beats 84.72%
// Memory 54.6 MB Beats 17.16%
// December 04, 2022

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
    private ListNode middleNode(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        return reverse(null,head,head.next);
    }
    private ListNode reverse(ListNode three,ListNode two,ListNode one){
        if(one==null){
            return two;
        }

        ListNode temp=one.next;
        one.next=two;
        two.next=three;
        return reverse(two,one,temp);
    }
}