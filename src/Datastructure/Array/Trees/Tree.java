package Datastructure.Array.Trees;

/**
 * Created by PRAVEEN SINGH on 2/16/2017.
 */
public class Tree<T> {
    public static void main(String args[]){
        Node<Integer> node=new Node<>(10);
        Node<Integer> leftchild=new Node<>(9);
        Node<Integer> rightchild=new Node<>(11);
        node.setLeftchild(leftchild);
        node.setRightchild(rightchild);
        Node<Integer> leftchild4=new Node<>(4);
        Node<Integer> rightchild5=new Node<>(5);
        leftchild.setLeftchild(leftchild4);
        leftchild.setRightchild(rightchild5);

    }
    public static void Breadthfirstsearch(Node root){

    }
    public static   class Node<T> {
        public T data;
        public Node<T> leftchild;
        public Node<T> rightchild;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getLeftchild() {
            return leftchild;
        }

        public void setLeftchild(Node<T> leftchild) {
            this.leftchild = leftchild;
        }

        public Node<T> getRightchild() {
            return rightchild;
        }

        public void setRightchild(Node<T> rightchild) {
            this.rightchild = rightchild;
        }


    }

}
