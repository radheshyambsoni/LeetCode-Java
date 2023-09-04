package LinkedList.Easy;

// 141. Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/
// Runtime 0 ms Beats 100%
// Memory 45.8 MB Beats 47.34%
// December 01, 2022

public class LinkedListCycle_141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}