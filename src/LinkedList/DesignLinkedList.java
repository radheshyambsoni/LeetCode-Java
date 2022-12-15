package LinkedList;

// https://leetcode.com/problems/design-linked-list/ - Medium
// Runtime 6 ms Beats 99.43% 
// Memory 42.6 MB Beats 90.81%
// December 15, 2022

class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList(){
        this.size=0;
    }

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        if(index==0){
            return head.val;
        }
        if(index==size-1){
            return tail.val;
        }

        if(index<size/2){
            Node temp=head;
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            return temp.val;
        }else{
            Node temp=tail;
            for(int i=size-1;i!=index;i--){
                temp=temp.prev;
            }
            return temp.val;
        }
    }
    
    public void addAtHead(int val) {
        Node node=new Node(val,head,null);
        if(head!=null){
            head.prev=node;
        }
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        if(head==null){
            addAtHead(val);
            return;
        }
        Node node=new Node(val,null,tail);
        tail.next=node;
        tail=node;   
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return;
        }

        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }

        if(index<=size/2){
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            Node node=new Node(val,temp.next,temp);
            temp.next=node;
            node.next.prev=node;
            size++;
        }else{
            Node temp=tail;
            for(int i=size-1;i!=index;i--){
                temp=temp.prev;
            }
            Node node=new Node(val,temp,temp.prev);
            temp.prev=node;
            node.prev.next=node;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(size==0 || index<0 || index>=size){
            return;
        }
        if(index==0){
            if(head==tail){
                head=null;
                tail=null;
                size=0;
                return;
            }
            head=head.next;
            head.prev=null;
            size--;
            return;
        }
        if(index==size-1){
            Node temp=tail.prev;            
            temp.next=null;
            tail=temp;
            size--;
            return;
        }

        if(index<size/2){
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
            size--;
        }else{
            Node temp=tail;
            for(int i=size-1;i!=index+1;i--){
                temp=temp.prev;
            }            
            temp.prev=temp.prev.prev;
            temp.prev.next=temp;
            size--;
        }
    }
}