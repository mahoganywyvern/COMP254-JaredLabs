/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-01-22
 */


// Main.java
public class Main {
    public static void main(String[] args) {
        // Create two doubly linked lists L and M
        DoublyLinkedList L = new DoublyLinkedList();
        L.insertAtEnd(1);
        L.insertAtEnd(2);
        L.insertAtEnd(3);
        L.insertAtEnd(4);

        DoublyLinkedList M = new DoublyLinkedList();
        M.insertAtEnd(5);
        M.insertAtEnd(6);
        M.insertAtEnd(7);
        M.insertAtEnd(8);

        // Display original lists
        System.out.println("Original List L:");
        L.displayList();
        System.out.println("Original List M:");
        M.displayList();

        // Concatenate L and M into a new list L'
        DoublyLinkedList concatenatedList = DoublyLinkedList.concatenateLists(L, M);

        // Display the concatenated list L'
        System.out.println("Concatenated List L':");
        concatenatedList.displayList();


    }
}
