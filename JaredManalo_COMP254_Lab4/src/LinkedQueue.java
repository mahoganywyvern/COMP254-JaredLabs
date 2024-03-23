/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 228
 * Section: 015
 * Username: moksi
 * Date: 2024-03-08
 */


import java.util.NoSuchElementException;

public class LinkedQueue<T> {
    private Node<T> first, last;

    private static class Node<T> {
        T item;
        Node<T> next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(T item) {
        Node<T> oldLast = last;
        last = new Node<>();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T item = first.item;
        first = first.next;

        if (isEmpty()) {
            last = null;
        }

        return item;
    }

    public void size() {
        int count = 0;
        Node<T> current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Size of the queue: " + count);
    }

    public void print() {
        Node<T> current = first;
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to concatenate another LinkedQueue to the end of this queue
    public void concatenate(LinkedQueue<T> Q2) {
        // Check if Q2 is empty, if so, there's nothing to concatenate, so return
        if (Q2.isEmpty()) {
            return; // Nothing to concatenate if Q2 is empty
        }
        // If queue is empty, make first node of queue point to first node of Q2
        if (isEmpty()) {
            first = Q2.first;
        } else {
            // If this queue is not empty, make next pointer of  last node of queue point to first node of Q2
            last.next = Q2.first;
        }
        // Update the last node of this queue to point to the last node of Q2
        last = Q2.last;
        // Empty Q2 by setting its first and last nodes to null
        Q2.first = Q2.last = null; // Empty Q2
    }
}
