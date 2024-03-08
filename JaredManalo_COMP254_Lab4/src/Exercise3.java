/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-03-08
 */

public class Exercise3 {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue1 = new LinkedQueue<>();
        LinkedQueue<Integer> queue2 = new LinkedQueue<>();

        // Enqueue some elements into queue1
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);

        // Enqueue some elements into queue2
        queue2.enqueue(4);
        queue2.enqueue(5);
        queue2.enqueue(6);

        // Print elements of queue1 before concatenation
        System.out.println("Queue1 before concatenation:");
        queue1.print();

        // Print elements of queue2 before concatenation (should be empty)
        System.out.println("Queue2 before concatenation:");
        queue2.print();

        // Concatenate queue2 to queue1
        queue1.concatenate(queue2);

        // Print elements of queue1 after concatenation
        System.out.println("Queue1 after concatenation:");
        queue1.print();

        // Print elements of queue2 after concatenation (should be empty)
        System.out.println("Queue2 after concatenation:");
        queue2.print();
    }
}