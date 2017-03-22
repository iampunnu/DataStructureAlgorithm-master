package Datastructure.Array.LinkList;

/**
 * Created by punnu on 3/9/17.
 */
public class Linklist2 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public  void push(int newdata){
        Node newnode=new Node(newdata);
      newnode.next= head;
        head=newnode;
    }
    public void insertafter(Node prevnode,int data){
        if (prevnode==null){
            System.out.println("no node found");
        }
        Node newnode=new Node(data);
        newnode.next=prevnode.next;
        prevnode.next=newnode;
    }
    public void append(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=new Node(data);
        }
        newnode.next=null;
        Node last=head;
        while (last.next != null){
            last = last.next;
        }
        last.next=newnode;
    }
    void deleteNode(int key)
    {

        Node temp = head, prev = null;


        if (temp != null && temp.data == key)
        {
            head = temp.next; // Changed head
            return;
        }

        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
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

        Linklist2 linklist2=new Linklist2();
        linklist2.push(45);
        linklist2.push(65);
        linklist2.append(76);
        linklist2.append(90);
        linklist2.append(77);
        linklist2.push(98);
        linklist2.insertafter(linklist2.head.next.next,66);
        linklist2.deleteNode(98);
        linklist2.printList();


    }
}


