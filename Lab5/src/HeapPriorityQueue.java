/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 228
 * Section: 015
 * Username: moksi
 * Date: 2024-03-21
 */
import java.util.ArrayList;

public class HeapPriorityQueue<E extends Comparable<E>> {
    private ArrayList<HeapNode<E>> heap;

    public HeapPriorityQueue() {
        heap = new ArrayList<>();
    }

    public void insert(E element) {
        heap.add(new HeapNode<>(element));
        upheap(heap.size() - 1);
    }
    public boolean isEmpty() {
        return heap.isEmpty();
    }
    public E removeMin() {
        if (heap.isEmpty())
            return null;

        E min = heap.get(0).element;
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        downheap(0);
        return min;
    }

    public void upheap(int j) {
        if (j > 0) {
            int parent = (j - 1) / 2;
            if (heap.get(j).element.compareTo(heap.get(parent).element) < 0) { //compare j's (index)
                swap(j, parent); //swap if less
                upheap(parent); //recur upwards
            }
        }
    }

    public void downheap(int j) {
        if (j < heap.size()) {
            int left = 2 * j + 1;
            int right = 2 * j + 2;
            int smallest = j;

            if (left < heap.size() && heap.get(left).element.compareTo(heap.get(smallest).element) < 0)
                smallest = left;

            if (right < heap.size() && heap.get(right).element.compareTo(heap.get(smallest).element) < 0)
                smallest = right;

            if (smallest != j) {
                swap(j, smallest);
                downheap(smallest);
            }
        }
    }

    private void swap(int i, int j) {
        HeapNode<E> temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
