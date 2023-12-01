package singlylinkedlist;

public class Node<T> {

    private Node<T> next;
    private Node<T> previous;
    private T value;

    public Node(Node<T> previous, Node<T> next, T value) {
        super();
        this.previous = previous;
        this.next = next;
        this.value = value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}