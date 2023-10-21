package LinkedList.Medium;

// 430. Flatten a Multilevel Doubly Linked List
// https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/description/
// Runtime 0 ms Beats 100%
// Memory 41.1 MB Beats 8.40%
// Oct 21, 2023

public class FlattenAMultilevelDoublyLinkedList_430 {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    Node[] dfs(Node curr) {
        Node head = curr;
        Node tail = null;
        while (curr != null) {
            Node next = curr.next;
            if (curr.child != null) {
                Node[] arr = dfs(curr.child);
                curr.next = arr[0];
                arr[0].prev = curr;
                arr[1].next = next;
                if (next != null)
                    next.prev = arr[1];
                curr.child = null;
                tail = arr[1];
                curr = next;
            } else {
                tail = curr;
                curr = next;
            }
        }

        return new Node[] { head, tail };
    }

    public Node flatten(Node head) {
        if (head == null)
            return null;

        dfs(head);
        return head;
    }
}