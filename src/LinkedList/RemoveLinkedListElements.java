package LinkedList;

// https://leetcode.com/problems/remove-linked-list-elements/ - Medium
// Runtime 1 ms Beats 98.72%
// Memory 43.2 MB Beats 85.19%
// Related Topics - Linked List, Recursion
// Date - November 29, 2022

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        while(head!=null && head.val==val){
            head=head.next;
        }
        if(head!=null){
            remove(head.next,val,head);
        }
        return head;
    }
    private void remove(ListNode node,int val,ListNode prev){
        if(node==null){
            prev.next=node;
            return;
        }
        if(node.val==val){
            remove(node.next,val,prev);
        }else{
            prev.next=node;
            remove(node.next,val,prev.next);
        }
    }
}