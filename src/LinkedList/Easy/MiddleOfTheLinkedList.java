package LinkedList.Easy;

// https://leetcode.com/problems/middle-of-the-linked-list/
// Runtime 0 ms Beats 100%
// Memory 41.4 MB Beats 58.87%
// December 03, 2022

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}