package LinkedList.Medium;

// 82. Remove Duplicates from Sorted List II
// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
// Runtime 0 ms Beats 100%
// Memory 43 MB Beats 75.30%
// Aug 05, 2023

public class RemoveDuplicatesFromSortedList2_82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(101, head);
        ListNode prev = dummy, curr = head, next = head.next;
        while (next != null) {
            if (curr.val == next.val) {
                int v = curr.val;
                while (curr != null && curr.val == v) {
                    curr = curr.next;
                }
                prev.next = curr;
                if (curr == null)
                    break;
                next = curr.next;
            } else {
                prev = curr;
                curr = next;
                next = next.next;
            }
        }
        return dummy.next;
    }
}