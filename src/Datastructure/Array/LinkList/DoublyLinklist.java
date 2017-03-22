package Datastructure.Array.LinkList;

/**
 * Created by punnu on 3/22/17.
 */
public class DoublyLinklist {
    Node head;
    class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data=data;

        }
        Node(Node next,Node previous,int data){
            this.previous=previous;
            this.next=next;
            this.data=data;
        }

    }
    public void push(int newdata){


        Node newnode=new Node(newdata);
        newnode.next=head;
        newnode.previous=null;
        head=newnode;
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    public static void main(String args[]){
        DoublyLinklist doublyLinklist=new DoublyLinklist();
        doublyLinklist.push(10);
        doublyLinklist.push(20);
        doublyLinklist.push(90);
        doublyLinklist.printList();
        }
}
