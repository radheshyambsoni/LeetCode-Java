package LinkedList.Easy;

// https://leetcode.com/problems/merge-two-sorted-lists/
// Runtime 0 ms Beats 100%
// Memory 42 MB Beats 84.94%
// December 01, 2022

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        
        ListNode head=new ListNode();
        if(list1.val>list2.val){
            head.val=list2.val;
            list2=list2.next;
        }else{
            head.val=list1.val;
            list1=list1.next;
        }
        ListNode temp=head;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                temp.next=list2;
                list2=list2.next;
            }else{
                temp.next=list1;
                list1=list1.next;
            }
            temp=temp.next;
        }
        if(list1!=null){
            temp.next=list1;
        }
        if(list2!=null){
            temp.next=list2;
        }
        return head;

        // kunal's ans
        // ListNode head=new ListNode();        
        // ListNode temp=head;
        // while(list1!=null && list2!=null){
        //     if(list1.val>list2.val){
        //         temp.next=list2;
        //         list2=list2.next;                
        //     }else{
        //         temp.next=list1;
        //         list1=list1.next;                
        //     }
        //     temp=temp.next;
        // }
        // temp.next=list1!=null?list1:list2;
        // return head.next;
    }
}