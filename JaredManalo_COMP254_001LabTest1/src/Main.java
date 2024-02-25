/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-02-21
 */
public class Main {
    public static void main(String[] args) {
        {

            int[] arrayM = {5, 3, 9, 1, 7, 2};
            int max = MaxFinder.findMax(arrayM);
            System.out.println("Exercise 1 output:");
            System.out.println("The maximum element in ArrayM: " + max);
            System.out.println();


            System.out.println("Exercise 2 output:");
            LinkedList list = new LinkedList();
            list.insertAtEnd(1);
            list.insertAtEnd(2);
            list.insertAtEnd(3);
            list.insertAtEnd(4);
            list.insertAtEnd(5);

            System.out.println("Original list:");
            list.display();

            list.reverse();

            System.out.println("Reversed list:");
            list.display();

            System.out.println();
            System.out.println("Exercise 3 output:");

            int[] arrayL = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

            System.out.println("ArrayL:");
            for (int num : arrayL) {
                System.out.print(num + " ");
            }
            System.out.println();

            int[] largestIndices = TenLarge.findTenLargest(arrayL);

            System.out.println("Ten largest elements in ArrayL:");
            for (int index : largestIndices) {
                System.out.print(arrayL[index] + " ");
            }
            System.out.println();

        }
    }
}