package singlylinkedlist;
/*
 * 
 * Linked list is collection of nodes. Singly linked list is unidirectional.
 * Head -> A -> B -> C -> D -> Null
 * 
 * Head refers to beginning of the linked list or initial node.
 * Null refers to end of the linked list
 * 
 */

public class SinglyLinkedList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>("A");
        linkedList.addNodeAtEnd("B");
        linkedList.addNodeAtEnd("C");
        linkedList.addNodeAtEnd("D");
        linkedList.addNodeAtEnd("E");
        linkedList.addNodeInBeginning("BEGIN");
        linkedList.addNodeAtIndex(0, "NEW HEAD");
        linkedList.addNodeAtIndex(20, "C.1");
        linkedList.printLinkedList();
    }

}

