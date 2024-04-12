import java.util.LinkedList;
import java.util.Queue;

public class Exercise2 {

    public static Queue<Integer> merge(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> mergedQueue = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                mergedQueue.add(q1.poll());
            } else {
                mergedQueue.add(q2.poll());
            }
        }

        while (!q1.isEmpty()) {
            mergedQueue.add(q1.poll());
        }

        while (!q2.isEmpty()) {
            mergedQueue.add(q2.poll());
        }

        return mergedQueue;
    }

    public static Queue<Queue<Integer>> bottomUpMergeSort(Queue<Queue<Integer>> queues) {
        while (queues.size() > 1) {
            Queue<Integer> q1 = queues.poll();
            Queue<Integer> q2 = queues.poll();
            Queue<Integer> mergedQueue = merge(q1, q2);
            queues.add(mergedQueue);
        }
        return queues;
    }

    public static void main(String[] args) {
        // Test your implementation here
        Queue<Integer> items = new LinkedList<>();
        items.add(4);
        items.add(2);
        items.add(7);
        items.add(1);
        items.add(5);
        items.add(3);

        Queue<Queue<Integer>> queues = new LinkedList<>();
        for (Integer item : items) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(item);
            queues.add(queue);
        }

        queues = bottomUpMergeSort(queues);

        // Printing the sorted queue
        Queue<Integer> sortedQueue = queues.poll();
        while (!sortedQueue.isEmpty()) {
            System.out.print(sortedQueue.poll() + " ");
        }
    }
}
