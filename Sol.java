import java.util.Arrays;
import java.util.Scanner;


class Node{
    int data;
    Node next;
    Node(int value){
        this.data=value;
        this.next=null;
    }
}

class Solution{
    Node merge(Node head1,Node head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        Node ansHead;
        if(head1.data<head2.data){
            ansHead=head1;
            head1=head1.next;
        }
        else{
            ansHead=head2;
            head2=head2.next;
        }

        Node curr=ansHead;

        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                curr.next=head1;
                head1=head1.next;
            }
            else{
                curr.next=head2;
                head2=head2.next;
            }
            curr=curr.next;
        }
        if(head1!=null){
            curr.next=head1;
        }
        else{
            curr.next=head2;
        }
        return ansHead;
    }
}
public class Sol {
    Node head,temp;
    Sol(){
        this.head=null;
    }

    //creating addAtLast method
    public void addAtLast(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            return;
        }
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sol l1=new Sol();
        Sol l2=new Sol();
        System.out.println("enter the l1 size");
        int n=sc.nextInt();
        System.out.println("enter the elements of l1");
        for(int i=0;i<n;i++){
            l1.addAtLast(sc.nextInt());
        }
        System.out.println("enter the l2 size");
        int m=sc.nextInt();
        System.out.println("enter the elements of l2");
        for(int i=0;i<m;i++){
            l2.addAtLast(sc.nextInt());
        }

        Solution ob=new Solution();
        Node h1=ob.merge(l1.head,l2.head);
        Node temp2=h1;
        while(temp2!=null){
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }
        System.out.println(" ");
    }
}