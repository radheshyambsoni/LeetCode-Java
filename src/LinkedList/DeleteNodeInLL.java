package LinkedList;

// https://leetcode.com/problems/delete-node-in-a-linked-list/ - Medium
// Runtime 0 ms Beats 100%
// Memory 42 MB Beats 84.39%
// December 15, 2022

public class DeleteNodeInLL {
    // The trick is to make value of node to be deleted equal to the one next to it
    // Then, we will just skip the node next to given node
    public void deleteNode(ListNode node) {
        ListNode nextNode=node.next;
        node.val=nextNode.val;
        node.next=nextNode.next;
    }
}
