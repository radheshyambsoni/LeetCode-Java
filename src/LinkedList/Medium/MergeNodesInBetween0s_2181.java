package LinkedList.Medium;

// 2181. Merge Nodes in Between Zeros
// https://leetcode.com/problems/merge-nodes-in-between-zeros/
// Runtime 7 ms Beats 75.78%
// Memory 75.9 MB Beats 73.26%
// Mar 23, 2023

public class MergeNodesInBetween0s_2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.next.val==0){
                if(temp.next.next==null) temp.next=null;
                else temp=temp.next;
            }
            else{
                temp.val+=temp.next.val;
                temp.next=temp.next.next;
            }
        }
        return head;
    }
}