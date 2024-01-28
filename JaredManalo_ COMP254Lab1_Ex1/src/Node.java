/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-01-22
 */

public class Node {
    private int data; // Integer data for Node
    private Node next; // Reference to next Node
    private Node prev; // Reference to previous Node

    // Constructors
    public Node() { }

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    // Getters and Setters
    public int getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
