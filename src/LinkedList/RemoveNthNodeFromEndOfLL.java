package LinkedList;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/ - Medium
// Runtime 0 ms Beats 100%
// Memory 40.7 MB Beats 79.65%
// December 15, 2022

public class RemoveNthNodeFromEndOfLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // for one pass - trick is using two pointers
        // maintaining a gap of n+1 in b/w slow and fast pointer
        // fast pointer will move n+1 places ahead;
        
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;
        
        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1; i<=n+1; i++){
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }
}