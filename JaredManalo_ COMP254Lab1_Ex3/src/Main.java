/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-01-28
 */
public class Main {
    public static void main(String[] args) {CircularLL cll = new CircularLL();
        cll.insertAtBeginning("Sohaib");
        //cll.display();
        cll.insertAtEnd("Bob");
        cll.insertAtEnd("Alice");
        //cll.display();
        cll.insertAtEnd("John");
        cll.insertAtEnd("Jane");

        System.out.println("Original List:");
        cll.display();

        CircularLL clonedList = cll.Clone();
        System.out.println("\nCloned List:");
        clonedList.display();



        //cll.insertAtPosition("Zaboomafoo", 2);

       // cll.display();

        //cll.insertAtPosition("scooby dooby doo", 4);

        //cll.display();

        //cll.deleteAtBeginning();

       // cll.display();

       // cll.deleteAtEnd();

        //cll.display();

       // cll.deleteAtPosition(2);

        //cll.display();
        }
    }
