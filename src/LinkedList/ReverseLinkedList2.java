package LinkedList;

// https://leetcode.com/problems/reverse-linked-list-ii/ - Medium
// Runtime 0 ms Beats 100%
// Memory 41.6 MB Beats 65.52%
// December 03, 2022

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right || head==null || head.next==null){
            return head;
        }
        
        // skip first left-1 nodes
        ListNode current=head,prev=null;
        for(int i=0;i<left-1;i++){
            prev=current;
            current=current.next;
        }
        ListNode last=prev;
        ListNode newEnd=current;

        // reverse between left and right
        ListNode next=current.next;        
        for(int i=0;i<right-left+1;i++){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }

        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        newEnd.next=current;
        return head;
    }
}