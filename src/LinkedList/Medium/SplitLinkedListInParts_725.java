package LinkedList.Medium;

// 725. Split Linked List in Parts
// https://leetcode.com/problems/split-linked-list-in-parts/
// Runtime 0 ms Beats 100%
// Memory 43.5 MB Beats 45.64%
// Jun 21, 2023

public class SplitLinkedListInParts_725 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }

        ListNode[] ans=new ListNode[k];
        if(k>=n){
            temp=head;
            int i=0;
            while(temp!=null){
                ans[i++]=temp;
                ListNode next=temp.next;
                temp.next=null;
                temp=next;
            }
        }else{
            int q=n/k,r=n%k,idx=0;
            temp=head;
            while(temp!=null){
                ans[idx++]=temp;
                int size=q+((r-->0)?1:0);
                for(int i=0;i<size-1;i++){
                    temp=temp.next;
                }
                ListNode next=temp.next;
                temp.next=null;
                temp=next;
            }
        }

        return ans;
    }
}