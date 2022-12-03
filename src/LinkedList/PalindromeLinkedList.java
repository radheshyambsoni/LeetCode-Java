package LinkedList;

// https://leetcode.com/problems/palindrome-linked-list/ - Easy
// Runtime 13 ms Beats 58.41%
// Memory 55.1 MB Beats 91.90%
// December 03, 2022

// Obviously, not the best - can be done using 2 stack as well
// pushing till mid in the stack and then popping out for after mid ones if equal

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        ListNode mid=middleNode(head);
        ListNode head2=reverseList(mid);
        // comapre both halves
        while(head!=null && head2!=null){
            if(head.val!=head2.val){
                return false;
            }
        }
        return true;
    }

    private ListNode middleNode(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

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