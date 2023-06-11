package Stacks.Medium;
import java.util.Stack;

import LinkedList.Medium.ListNode;

// 2487. Remove Nodes From Linked List
// https://leetcode.com/problems/remove-nodes-from-linked-list/
// Runtime 108 ms Beats 26.27%
// Memory 61 MB Beats 77.11%
// June 11, 2023

public class RemoveNodesFromLinkedList_2487 {
    public ListNode removeNodes(ListNode head) {
        if(head.next==null) return head;
        ListNode temp=head;
        Stack<ListNode> st=new Stack<>();
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        temp=null;
        while(!st.isEmpty()){
            ListNode pop=st.pop();
            if(temp!=null){
                if(pop.val>=temp.val){
                    pop.next=temp;
                    temp=pop;
                }
            }else{
                temp=pop;
            }
        }
        return temp;
    }
}