package LinkedList.Medium;

// https://leetcode.com/problems/sort-list/ - Medium
// Runtime 12 ms Beats 93.5%
// Memory 50.1 MB Beats 96.65%
// December 03, 2022

public class SortList {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode mid=getMid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);

        return merge(left,right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode head=new ListNode();
        ListNode temp=head;
        while(left!=null && right!=null){
            if(left.val>right.val){
                temp.next=right;
                right=right.next;
            }else{
                temp.next=left;
                left=left.next;
            }
            temp=temp.next;
        }
        temp.next=left!=null?left:right;
        return head.next;
    }

    private ListNode getMid(ListNode head) {
        ListNode midPrev=null;
        while (head!=null && head.next!=null) {
            midPrev=(midPrev==null)?head:midPrev.next;
            head=head.next.next;
        }
        ListNode mid=midPrev.next;
        midPrev.next=null;
        return mid;
    }
}
