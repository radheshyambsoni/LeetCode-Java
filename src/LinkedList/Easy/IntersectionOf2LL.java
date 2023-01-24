package LinkedList.Easy;

// import java.util.HashMap;

// https://leetcode.com/problems/intersection-of-two-linked-lists/
// December 15, 2022

public class IntersectionOf2LL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Runtime 6 ms Beats 54.3%
        // Memory 45.6 MB Beats 79.89%
        // HashMap<ListNode,Integer> map=new HashMap<>();
        // ListNode temp=headA;
        // while(temp!=null){
        //     map.put(temp,temp.val);
        // }

        // temp=headB;
        // while(temp!=null){
        //     if(map.containsKey(temp) && map.get(temp)==temp.val){
        //         return temp;
        //     }
        // }

        // return null;


        // Runtime 1 ms Beats 99.83%
        // Memory 45.1 MB Beats 92.7%
        int m=0,n=0;
        ListNode tempA=headA,tempB=headB;
        while(tempA!=null){m++;tempA=tempA.next;}
        while(tempB!=null){n++;tempB=tempB.next;}

        tempA=headA;
        tempB=headB;

        if(m>n){
            for(int i=0;i<m-n;i++){
                tempA=tempA.next;
            }
        }else{
            for(int i=0;i<n-m;i++){
                tempB=tempB.next;
            }
        }

        while(tempA!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }

        return null;
    }
}