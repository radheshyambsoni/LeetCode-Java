package LinkedList.Medium;

// 86. Partition List
// https://leetcode.com/problems/partition-list/
// Runtime 0 ms Beats 100%
// Memory 42.2 MB Beats 26.19%
// Mar 25, 2023

public class PartitionList_86 {
    public ListNode partition(ListNode head, int x) {
        ListNode h1=new ListNode();
        ListNode temp=h1,t1=head;
        while(t1!=null){
            if(t1.val<x){
                ListNode node=new ListNode(t1.val);
                temp.next=node;
                temp=node;
            }
            t1=t1.next;
        }
        t1=head;
        while(t1!=null){
            if(t1.val>=x){
                ListNode node=new ListNode(t1.val);
                temp.next=node;
                temp=node;
            }
            t1=t1.next;
        }
        return h1.next;
    }
}
