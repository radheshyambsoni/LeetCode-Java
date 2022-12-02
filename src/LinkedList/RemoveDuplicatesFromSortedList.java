package LinkedList;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/ - Easy
// Runtime 0 ms Beats 100%
// Memory 42.2 MB Beats 82.53%
// December 01, 2022

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {        
        ListNode node=head;
        while(node!=null && node.next!=null){
            if(node.val==node.next.val){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
        return head;
    }
}