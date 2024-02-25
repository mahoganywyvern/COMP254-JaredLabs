/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-02-21
 */
public class LinkedList {
    private Node head;
    private Node tail;

    // Constructor
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void reverse() {
        if (head == null || head == tail) {
            // null and empty check for invalid lists
            return;
        }

        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.getNext(); // Store next node
            current.setNext(prev);    // Reverse link

            // Move pointer one position ahead
            prev = current;
            current = next;
        }

        // Adjust head/tail pointers
        tail = head;
        head = prev;
    }

    // Method to insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    // Method to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(head);
            this.head = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
