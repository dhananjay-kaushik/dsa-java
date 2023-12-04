package singlylinkedlist;

public class Node<T> {

    private Node<T> next;
    private T value;

    public Node(Node<T> next, T value) {
        super();
        this.next = next;
        this.value = value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}