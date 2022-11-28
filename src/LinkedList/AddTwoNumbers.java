package LinkedList;

// https://leetcode.com/problems/add-two-numbers/description/ - Medium
// Runtime 3 ms Beats 79.86%
// Memory 48 MB Beats 36.65%
// Related Topics - Linked List, Math, Recursion
// Date - November 28, 2022

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val=l1.val+l2.val;
        ListNode ans=new ListNode(val%10);
        int carry=val/10;
        add(l1.next,l2.next,ans,carry);
        return ans;
    }
    public void add(ListNode l1,ListNode l2,ListNode ans,int carry){
        if(l1==null && l2==null && carry==0){
            return;
        }

        int val=carry;
        if(l1!=null){
            val+=l1.val;
            l1=l1.next;
        }
        if(l2!=null){
            val+=l2.val;
            l2=l2.next;
        }

        ans.next=new ListNode(val%10);
        carry=val>=10?1:0;

        add(l1,l2,ans.next,carry);
    }
}