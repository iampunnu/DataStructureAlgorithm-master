package Datastructure.Array.LinkList;

/**
 * Created by PRAVEEN SINGH on 2/16/2017.
 */
public class Linklist
{
    public static void main(String[] args) {
        LinkedListNode linkedListNode=new LinkedListNode(3);
        LinkedListNode linkedListNode1=new LinkedListNode(5);
        linkedListNode1.setData(7);
        LinkedListNode linkedListNode2=new LinkedListNode(6);
        linkedListNode1.setNext(linkedListNode2);
        linkedListNode.setNext(linkedListNode1);
        insertatend(linkedListNode,new LinkedListNode(2));

printLinklist(linkedListNode);
getLengthofLL(linkedListNode1);


    }
    private static void insertatend(LinkedListNode linkedListNode,LinkedListNode add){
        while(linkedListNode.getNext()!=null){
            linkedListNode=linkedListNode.getNext();
        }
        linkedListNode.setNext(add);
    }
    private static void getLengthofLL(LinkedListNode linkedListNode){
        int length=0;
        while (linkedListNode!=null){
            length++;
           linkedListNode= linkedListNode.getNext();
        }
        System.out.println(length);

    }
 private static void printLinklist(LinkedListNode linkedListNode){
        while(linkedListNode!=null){
            System.out.print(linkedListNode.getData()+"->");
            linkedListNode=linkedListNode.getNext();
        }
     System.out.println("null");
}
    public static class LinkedListNode{
        int data;
        LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
        }

        public LinkedListNode getNext() {
            return next;
        }

        public void setNext(LinkedListNode next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

}

