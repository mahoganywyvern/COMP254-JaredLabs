/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-01-28
 */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
} */

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();


        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);


        linkedList.display();


        // (20 and 40)
        Node node2 = linkedList.getHead().getNext();
        Node node4 = node2.getNext().getNext();

        // Swap the nodes
        linkedList.swapNodes(node2, node4);

        // Display the linked list after swapping nodes
        System.out.println("\nLinked List after swapping nodes:");
        linkedList.display();



    }

}