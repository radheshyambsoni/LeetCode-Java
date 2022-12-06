package LinkedList;

// https://leetcode.com/problems/odd-even-linked-list/description/
// Runtime 0 ms Beats 100%
// Memory 44.7 MB Beats 41.26%
// December 06, 2022 - Daily Challenge

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode temp=head,temp2=head.next,head2=head.next;
        while(temp2!=null && temp2.next!=null){
            temp.next=temp.next.next;            
            temp=temp.next;
            temp2.next=temp2.next.next;
            temp2=temp2.next;
        }
        temp.next=head2;
        return head;
    }
}