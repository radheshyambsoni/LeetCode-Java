package LinkedList;

// https://leetcode.com/problems/linked-list-cycle-ii/ - Medium
// Runtime 0 ms Beats 100%
// Memory 42.1 MB Beats 99.59%
// Decmber 02, 2022

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        int length=0;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){                
                do{
                    slow=slow.next;
                    length++;
                }while(fast!=slow);                
            }
        }
        slow=head;
        fast=head;
        while(length-->0){
            fast=fast.next;
        }
        // keep moving forward and they will meet at cycle start
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }    
}