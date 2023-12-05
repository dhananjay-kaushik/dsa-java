package circularlinkedlist;

public class LinkedList<T> {
    private Node<T> headNode;
    
    public LinkedList(T headNodeValue) {
        this.headNode = new Node<T>(null, null, headNodeValue);
        this.headNode.setPrevious(this.headNode);
        this.headNode.setNext(this.headNode);
    }

    public Node<T> getHeadNode() {
        return this.headNode;
    }

    public void printLinkedList() {
        Node<T> current = this.headNode;
        do {
            // Print current
            System.out.print(" <-> " + current.getValue());
            // Update current
            current = current.getNext();
        } while(current != this.headNode);
        System.out.println();
    }

    public void printLinkedListReversed() {
        Node<T> current = this.headNode;
        do {
            // Print current
            System.out.print(" <-> " + current.getValue());
            // Update current
            current = current.getPrevious();
        } while(current != this.headNode);
        System.out.println();
    }

    public void addNodeAtEnd(T value) {
        Node<T> current = this.headNode;
        while(current.getNext() != this.headNode) {
            current = current.getNext();
        }

        // Current holds last element
        Node<T> newNode = new Node<T>(current, this.headNode, value);
        current.setNext(newNode);
        this.headNode.setPrevious(newNode);
    }

    public void addNodeInBeginning(T value) {
         Node<T> newNode = new Node<T>(this.headNode.getPrevious(), this.headNode, value);
         this.headNode.getPrevious().setNext(newNode);
         this.headNode.setPrevious(newNode);
         this.headNode = newNode;
    }

    public void addNodeAtIndex(int index, T value) {
        if (index == 0) {
            this.addNodeInBeginning(value);
            return;
        }

        Node<T> current = this.headNode;
        int i = 0;
        while(current.getNext() != this.headNode) {
            if (i == index) {
                break;
            }
            ++i;
            current = current.getNext();
        }

        if (current.getNext() == this.headNode) {
            System.out.println("Enter at last index");
            this.addNodeAtEnd(value);
            return;
        }

        if ((i != index)) {
            throw new IndexOutOfBoundsException(String.format("Index: %s provided is more than length of linked list.", index));
        } else {
            Node<T> newNode = new Node<T>(current, current.getNext(), value);
            current.getNext().setPrevious(newNode);
            current.setNext(newNode);
        }
    }
}