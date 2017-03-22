package Datastructure.Array.Stack;

/**
 * Created by PRAVEEN SINGH on 2/16/2017.
 */
public class Element<T> {
    public T data;
    public Element<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }

    public Element(T data, Element<T> next) {

        this.data = data;
        this.next = next;
    }
}
