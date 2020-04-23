package datastructure.linkedlist;

public class App {

    public static void main(String[] args) {
        SinglyLinkedList<Object> linkedList = new SinglyLinkedList<>();
        linkedList.printList();
        linkedList.insertAtHead(1);
        linkedList.printList();
        linkedList.insertAtEnd(2);
        linkedList.printList();
        linkedList.insertAfter(5, 2);
        linkedList.printList();
    }

}
