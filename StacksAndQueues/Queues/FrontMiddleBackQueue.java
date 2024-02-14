package StacksAndQueues.Queues;

public class FrontMiddleBackQueue {
    private Node front;
    private Node back;
    private Node middle;
    private int size;
    //doubly Node having integer value with prev and next pointers
    private class Node{
        int val;
        Node next;
        Node prev;
        Node(){};
        Node(int value){
            this.val=value;
            this.next=null;
            this.prev=null;
        }
    }
    public FrontMiddleBackQueue() {
        //initially front back and middle node will be null
        front=null;
        back=null;
        middle=null;
        size=0;
    }

    public void pushFront(int val) {
        Node node=new Node(val);
        //if front node is null then assign front,back and middle node
        //to newly created node
        if(front==null){
            front=node;
            back=front;
            middle=front;
        }
        //otherwise push before front node and make that node front node
        else{
            node.next=front;
            front.prev=node;
            front=node;
        }
        //rearrange middle node
        if(size%2==1) middle=middle.prev;
        size++;
    }

    public void pushMiddle(int val) {
        Node node=new Node(val);
        //if middle node is null then assign front,back and middle node
        //to newly created node
        if(middle==null){
            front=node;
            back=front;
            middle=front;
        }
        //Otherwise
        else{
            //if size of list is even then push after middle node and
            // make that node middle node
            if(size%2==0){
                node.next=middle.next;
                if(node.next!=null)node.next.prev=node;
                middle.next=node;
                node.prev=middle;
                middle=node;
            }
            //otherwise push before middle node and make that node middle node
            else{
                if(middle.prev!=null)middle.prev.next=node;
                node.prev=middle.prev;
                middle.prev=node;
                node.next=middle;
                middle=node;
            }
            //important check
            //if middle node becomes first node of list then make
            //front node also first node
            if(middle.prev==null){
                front=middle;
            }
        }
        size++;
    }

    public void pushBack(int val) {
        Node node=new Node(val);
        //if back node is null then assign front,back and middle node
        //to newly created node
        if(back==null){
            front=node;
            back=front;
            middle=front;
        }
        //push after back node and make that node back node
        else{
            back.next=node;
            node.prev=back;
            back=node;
        }
        //rearrange middle node
        if(size>0&&size%2==0) middle=middle.next;
        size++;
    }

    public int popFront() {
        if(front==null){
            return -1;
        }
        int num=front.val;
        //delete front node and move front node ahead by 1 position
        front=front.next;
        if(front!=null) front.prev=null;
//if front node becomes null then make back and middle node also null
        else{
            back=null;
            middle=null;
        }
        //rearrange middle node
        if(size%2==0&&middle!=null) middle=middle.next;
        size--;
        return num;
    }

    public int popMiddle() {
        if(middle==null){
            return -1;
        }
        int num=middle.val;
        //delete middle node
        if(middle.prev!=null)middle.prev.next=middle.next;
        if(middle.next!=null)middle.next.prev=middle.prev;
//if size of list is even then move middle node ahead by 1 position
        if(size%2==0) middle=middle.next;
//otherwise move middle node behind by 1 position
        else middle=middle.prev;
        if(middle==null){
            front=null;
            back=null;
        }
        //important check
        //if size=2 means front and middle node is same so by deleting
        //middle node,front node will also be deleted so make front=middle
        if(size==2) front=middle;
        size--;
        return num;
    }

    public int popBack() {
        if (back == null) {
            return -1;
        }
        int num = back.val;
        // Delete back node and move back node behind by 1 position
        back = back.prev;
        if (back == null) {
            // If back node is null, make front and middle node also null
            front = null;
            middle = null;
        } else {
            // Rearrange middle node
            if (size % 2 == 1 && middle != null) {
                middle = middle.prev;
            }
            back.next = null; // Check back before accessing back.next
        }
        size--;
        return num;
    }
}
