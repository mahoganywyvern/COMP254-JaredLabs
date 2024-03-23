/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 228
 * Section: 015
 * Username: moksi
 * Date: 2024-03-21
 */
public class HP {
    public static void main(String[] args) {
        HeapPriorityQueue<Integer> heap = new HeapPriorityQueue<>();

        /*heap.insert(4);
        heap.insert(2);
        heap.insert(6);
        heap.insert(1);
        heap.insert(5); */

       /* heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(10); */

        heap.insert(8);
        heap.insert(12);
        heap.insert(3);
        heap.insert(6);
        heap.insert(1);


        System.out.println("Heap:");
        while (!heap.isEmpty()) {
            System.out.println(heap.removeMin());
        }
    }
}
