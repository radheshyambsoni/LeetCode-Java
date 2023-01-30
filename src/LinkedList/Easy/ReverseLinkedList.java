package LinkedList.Easy;

// https://leetcode.com/problems/reverse-linked-list/
// Runtime 0 ms Beats 100%
// Memory 43.1 MB Beats 30.31%
// Related Topics - Linked List, Recursion
// December 01, 2022

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        return reverse(null,head,head.next);
    }
    public ListNode reverse(ListNode three,ListNode two,ListNode one){
        if(one==null){
            return two;
        }

        ListNode temp=one.next;
        one.next=two;
        two.next=three;
        return reverse(two,one,temp);
    }
}