package LinkedList.Medium;

// https://leetcode.com/problems/rotate-list/ - Medium
// Runtime 0 ms Beats 100%
// Memory 41.7 MB Beats 92.68%
// December 04, 2022

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null){
            return head;
        }

        int l=1; //length of linked list
        ListNode temp=head;
        while(temp.next!=null){            
            temp=temp.next;
            l++;
        }
        k=k%l;
        if(k==0){
            return head;
        }
        ListNode temp2=head;
        for(int i=1;i<l-k;i++){
            temp2=temp2.next;
        }
        temp.next=head;
        head=temp2.next;
        temp2.next=null;
        
        return head;
    }
}