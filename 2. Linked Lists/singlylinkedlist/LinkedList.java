package singlylinkedlist;

public class LinkedList<T> {
    private Node<T> headNode;
    
    public LinkedList(T headNodeValue) {
        this.headNode = new Node<T>(null, headNodeValue);
    }

    public Node<T> getHeadNode() {
        return this.headNode;
    }

    public void printLinkedList() {
        System.out.print("Head");
        Node<T> current = this.headNode;
        while(current != null) {
            // Print current
            System.out.print(" -> " + current.getValue());
            // Update current
            current = current.getNext();
        }

        System.out.print(" -> Null");
        System.out.println();
    }

    public void addNodeAtEnd(T value) {
        Node<T> current = this.headNode;
        while(current.getNext() != null) {
            current = current.getNext();
        }

        // Current holds last element
        Node<T> newNode = new Node<T>(null, value);
        current.setNext(newNode);
    }

    public void addNodeInBeginning(T value) {
         Node<T> newNode = new Node<T>(this.headNode, value);
         this.headNode = newNode;
    }

    public void addNodeAtIndex(int index, T value) {
        if (index == 0) {
            this.addNodeInBeginning(value);
            return;
        }

        Node<T> current = this.headNode;
        int i = 0;
        while(current != null) {
            if (i == index) {
                break;
            }
            ++i;
            current = current.getNext();
        }

        if ((i != index) && current == null) {
            throw new IndexOutOfBoundsException(String.format("Index: %s provided is more than length of linked list.", index));
        } else {
            Node<T> newNode = new Node<T>(current.getNext(), value);
            current.setNext(newNode);
        }
    }
}