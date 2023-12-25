package LinkedList.Medium;

// 2807. Insert Greatest Common Divisors in Linked List
// https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/
// Runtime 2 ms Beats 90.34%
// Memory 45.65 MB Beats 6.49%
// Dec 25, 2023

public class InsertGreatestCommonDivisorsInLinkedList_2807 {
    int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode temp = head;
        while (temp.next != null) {
            int val = gcd(temp.val, temp.next.val);
            ListNode node = new ListNode(val);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }

        return head;
    }
}