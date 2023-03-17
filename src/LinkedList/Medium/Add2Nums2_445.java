package LinkedList.Medium;

// import java.util.Stack;

// 445. Add Two Numbers II
// https://leetcode.com/problems/add-two-numbers-ii/
// Mar 17, 2023

public class Add2Nums2_445{
    // Runtime 2 ms Beats 100%
    // Memory 42.8 MB Beats 24.92%
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        int carry=0;
        ListNode head=new ListNode();
        while(l1!=null && l2!=null){
            int val=l1.val+l2.val+carry;
            head.val=val%10;
            carry=val/10;
            ListNode temp=new ListNode();
            temp.next=head;
            head=temp;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int val=l1.val+carry;
            head.val=val%10;
            carry=val/10;
            ListNode temp=new ListNode();
            temp.next=head;
            head=temp;
            l1=l1.next;
        }
        while(l2!=null){
            int val=l2.val+carry;
            head.val=val%10;
            carry=val/10;
            ListNode temp=new ListNode();
            temp.next=head;
            head=temp;
            l2=l2.next;
        }
        if(carry==0){
            head=head.next;
        }else{
            head.val=carry;
        }
        return head;
    }
    ListNode reverse(ListNode l){
        ListNode prev=null,next=null;
        while(l!=null){
            next=l.next;
            l.next=prev;
            prev=l;
            l=next;
        }
        return prev;
    }

    // Follow up: Could you solve it without reversing the input lists?
    // Runtime 5 ms Beats 37%
    // Memory 42.7 MB Beats 30.81%
    // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //     Stack<ListNode> s1=new Stack<>();
    //     Stack<ListNode> s2=new Stack<>();
    //     while(l1!=null && l2!=null){
    //         s1.push(l1);
    //         l1=l1.next;
    //         s2.push(l2);
    //         l2=l2.next;
    //     }
    //     while(l1!=null){
    //         s1.push(l1);
    //         l1=l1.next;
    //     }
    //     while(l2!=null){
    //         s2.push(l2);
    //         l2=l2.next;
    //     }
    //     int carry=0;
    //     ListNode head=new ListNode();
    //     while(!s1.isEmpty() && !s2.isEmpty()){
    //         int val=s1.pop().val+s2.pop().val+carry;
    //         head.val=val%10;
    //         carry=val/10;
    //         ListNode temp=new ListNode();
    //         temp.next=head;
    //         head=temp;
    //     }
    //     while(!s1.isEmpty()){
    //         int val=s1.pop().val+carry;
    //         head.val=val%10;
    //         carry=val/10;
    //         ListNode temp=new ListNode();
    //         temp.next=head;
    //         head=temp;
    //     }
    //     while(!s2.isEmpty()){
    //         int val=s2.pop().val+carry;
    //         head.val=val%10;
    //         carry=val/10;
    //         ListNode temp=new ListNode();
    //         temp.next=head;
    //         head=temp;
    //     }
    //     if(carry==0){
    //         head=head.next;
    //     }else{
    //         head.val=carry;
    //     }
    //     return head;
    // }
}