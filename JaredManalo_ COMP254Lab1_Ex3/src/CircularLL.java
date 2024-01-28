/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-01-28
 */
public class CircularLL {
    private Node head;
    private Node tail;
    private int size;

    /**
     * Default constructor
     */
    public CircularLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Method to add a node to the beginning of the circular linked list
     * @param head
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * Method to add a node to the end of the circular linked list
     * @param tail
     */
    public void setTail(Node tail) {
        this.tail = tail;
    }

    /**
     * Method to get the head of the circular linked list
     * @return head
     */
    public Node getHead() {
        return this.head;
    }

    /**
     * Method to get the tail of the circular linked list
     * @return tail
     */
    public Node getTail() {
        return this.tail;
    }

    /**
     * Method to insert a node at the beginning of the circular linked list
     * @param data
     */
    public void insertAtBeginning(String data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.tail.setNext(head);
        } else {
            newNode.setNext(head);
            this.head = newNode;
            this.tail.setNext(head);
        }
        this.size++;
    }

    /**
     * Method to insert a node at the end of the circular linked list
     * @param data
     */
    public void insertAtEnd(String data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.tail.setNext(head);
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
            this.tail.setNext(head);
        }
        this.size++;
    }

    /**
     * Method to insert a node at a given position in the circular linked list
     * @param data
     * @param position
     */
    public void insertAtPosition(String data, int position) {
        Node newNode = new Node(data);
        if (this.head == null || position <= 0) {
            insertAtBeginning(data);
        } else {
            Node current = this.head;
            for (int i = 1; i < position - 1 && current != this.tail; i++) {
                current = current.getNext();
            }
            if (current != tail) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
            } else {
                insertAtEnd(data);
            }
        }
        this.size++;
    }

    public void deleteAtBeginning() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            this.head = this.head.getNext();
            this.tail.setNext(this.head);
            this.size--;
        }
    }

    public void deleteAtEnd() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            Node current = this.head;
            while (current.getNext() != this.tail) {
                current = current.getNext();
            }
            this.tail = current;
            this.tail.setNext(this.head);
            size--;
        }
    }

    public void deleteAtPosition(int position) {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            Node current = this.head;
            for (int i = 1; i < position - 1 && current != this.tail; i++) {
                current = current.getNext();
            }
            if (current != this.tail) {
                current.setNext(current.getNext().getNext());
            } else {
                deleteAtEnd();
            }
            size--;
        }
    }

    public CircularLL Clone() {
        // Create a new instance of CircularLL to store the cloned list
        CircularLL clonedList = new CircularLL();

        // Check if OG list is not empty
        if (this.head != null) {
            // Initialize a reference to the current node in the original list
            Node originalCurrent = this.head;

            // goe through the original list until the tail is reached
            while (originalCurrent != this.tail) {
                // add copied node to new list
                clonedList.insertAtEnd(originalCurrent.getData());

                // Move to the next node in the OG list
                originalCurrent = originalCurrent.getNext();
            }

            // Insert the last node of the OG list into the cloned list
            clonedList.insertAtEnd(originalCurrent.getData());

            // Set head and tail of the cloned list
            clonedList.setHead(clonedList.getHead());
            clonedList.setTail(clonedList.getTail());
        }

        // Return cloned list
        return clonedList;
    }

    /**
     * Method to display the circular linked list
     */
    public void display() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            Node current = this.head;
            System.out.print(this.size + " ");
            do {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            } while (current != this.head);
            System.out.println();
        }
    }
}