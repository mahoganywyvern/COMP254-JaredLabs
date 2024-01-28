/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-01-22
 */

// DoublyLinkedList.java
public class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Constructor
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Method to insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data, null, null);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setPrev(this.tail);
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    // Method to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data, null, null);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(this.head);
            this.head.setPrev(newNode);
            this.head = newNode;
        }
    }

    // Method to insert a node in between
    public void insertInBetween(int data, int position) {
        Node newNode = new Node(data, null, null);
        if (this.head == null || position <= 0) {
            // Insert at the beginning if the list is empty or position is invalid
            insertAtBeginning(data);
        } else {
            Node current = this.head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.getNext();
            }
            if (current != null) {
                newNode.setNext(current.getNext());
                newNode.setPrev(current);
                if (current.getNext() != null) {
                    current.getNext().setPrev(newNode);
                }
                current.setNext(newNode);
                if (current == this.tail) {
                    this.tail = newNode;
                }
            } else {
                // Insert at the end if the position is beyond the current size
                insertAtEnd(data);
            }
        }
    }

    // Method to concatenate two doubly linked lists
    public static DoublyLinkedList concatenateLists(DoublyLinkedList L, DoublyLinkedList M) {
        DoublyLinkedList concatenatedList = new DoublyLinkedList();

        // Connect the end of L to the beginning of M
        if (L.tail != null && M.head != null) {
            L.tail.setNext(M.head);
            M.head.setPrev(L.tail);
        }

        // Update the head and tail of the concatenated list
        concatenatedList.head = (L.head != null) ? L.head : M.head;
        concatenatedList.tail = (M.tail != null) ? M.tail : L.tail;

        return concatenatedList;
    }

    // Method to display the doubly linked list
    public void displayList() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
