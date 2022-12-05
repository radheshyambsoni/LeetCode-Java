package LinkedList;

// Not done yet

// public class ReverseNodesInKGroup {
//     public ListNode reverseKGroup(ListNode head, int k) {
//         if(k<=1 || head==null){
//             return head;
//         }

//         ListNode current=head,prev=null;
//         while(true){
//             ListNode last=prev;
//             ListNode newEnd=current;

//             // reverse k group
//             ListNode next=current.next;        
//             for(int i=0;i<k;i++){
//                 current.next=prev;
//                 prev=current;
//                 current=next;
//                 if(next!=null){
//                     next=next.next;
//                 }
//             }

//             if(last!=null){
//                 last.next=prev;
//             }else{
//                 head=prev;
//             }
//             newEnd.next=current;

//             if(current==null){
//                 break;
//             }

//             prev=newEnd;
//         }
//         return head;
//     }
// }