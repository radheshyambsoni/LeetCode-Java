package LinkedList.Medium;

// 2130. Maximum Twin Sum of a Linked List
// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/
// Runtime 4 ms Beats 99.89%
// Memory 62.8 MB Beats 41.52%
// May 17, 2023

public class MaxTwinSumOfALinkedList_2130 {
    public int pairSum(ListNode head) {
        ListNode prev=null,slow=head,fast=head.next;
        while(fast.next!=null){
            fast=fast.next.next;
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        fast=slow.next;
        slow.next=prev;
        int max=0;
        while(slow!=null){
            max=Math.max(max,slow.val+fast.val);
            slow=slow.next;
            fast=fast.next;
        }
        return max;
    }
}