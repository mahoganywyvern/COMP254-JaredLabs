/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-01-28
 */
public class LinkedList {
    private Node head;
    private Node tail;

    // Constructor
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public Node getHead() {
        return head;
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

    // Method to insert a node in between
    public void insertInBetween(int data, int position) {
        Node newNode = new Node(data);
        if (head == null || position <= 0) {
            // Insert at the beginning if the list is empty or position is invalid
            insertAtBeginning(data);
        } else {
            Node current = head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.getNext();
            }
            if (current != null) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                if (current == tail) {
                    tail = newNode;
                }
            } else {
                // Insert at the end if the position is beyond the current size
                insertAtEnd(data);
            }
        }
    }

    // Method to remove a node from the end
    public void removeFromEnd() {
        if (head == null) {
            return; // List is empty
        }

        if (head == tail) {
            // Only one node in the list
            head = tail = null;
            return;
        }

        Node current = head;
        while (current.getNext() != tail) {
            current = current.getNext();
        }

        current.setNext(null);
        tail = current;
    }

    // Method to remove a node from the beginning
    public void removeFromBeginning() {
        if (head == null) {
            return; // List is empty
        }

        if (head == tail) {
            // Only one node in the list
            head = tail = null;
        } else {
            head = head.getNext();
        }
    }

    // Method to remove a node from in between
    public void removeFromInBetween(int position) {
        if (head == null || position <= 0) {
            return; // List is empty or position is invalid
        }

        if (position == 1) {
            // Remove from the beginning
            removeFromBeginning();
        } else {
            Node current = head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.getNext();
            }
            if (current != null && current.getNext() != null) {
                current.setNext(current.getNext().getNext());
                if (current.getNext() == null) {
                    // If the removed node was the last node, update tail
                    tail = current;
                }
            }
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


    public void swapNodes(Node node1, Node node2) {

        Node prev1 = null, prev2 = null, current = head;

        while (current != null && (prev1 == null || prev2 == null)) {
            if (current.getNext() == node1) {
                prev1 = current;
            } else if (current.getNext() == node2) {
                prev2 = current;
            }

            current = current.getNext();
        }

        prev1.setNext(node2);
        prev2.setNext(node1);

        Node temp = node1.getNext();
        node1.setNext(node2.getNext());
        node2.setNext(temp);

        // Update the tail if necessary
        if (tail == node1) {
            tail = node2;
        } else if (tail == node2) {
            tail = node1;
        }
    }




}