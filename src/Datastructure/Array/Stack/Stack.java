package Datastructure.Array.Stack;

/**
 * Created by PRAVEEN SINGH on 2/16/2017.
 */
public class Stack<T> {
    int Max_Size=40;
    int size=0;
    Element<T> top;

    public static void main(String[] args) throws StackoverflowException, StackunderflowException {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
       stack.print(stack);
        System.out.println(stack.peek());

    }
    public void print(Stack stack)throws StackunderflowException{
        int size=stack.getSize();
   while(size!=0){
       System.out.print(stack.pop());
       if(stack.getSize()!=0){
           System.out.print(",");
           size--;
       }

   }

    }
    public T peek()throws StackunderflowException{
        if(size==0){
            throw new StackunderflowException();
        }
        return top.getData();
    }
    public T pop()throws StackunderflowException{
        if(size==0){
            throw new StackunderflowException();
        }
        T data=top.getData();
        top=top.getNext();
        return data;

    }
    public int getSize(){return size;}
    public void push(T data)throws StackoverflowException{if(size==Max_Size){
    throw new StackoverflowException();}
    Element elm=new Element(data,top);
    top=elm;
    size++;
    }
    public static class StackoverflowException extends Exception{}
    public static class StackunderflowException extends Exception{}
}
