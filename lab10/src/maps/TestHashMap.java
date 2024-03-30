package maps;

import java.util.Random;

public class TestHashMap {
    public static void main(String[] args) {
        // Experiment with ChainHashMap
        System.out.println("Experimenting with ChainHashMap:");
        testHashMap(new ChainHashMap<Integer, String>(100, 109345121, 0.5));
        System.out.println();

        // Experiment with ProbeHashMap
        System.out.println("Experimenting with ProbeHashMap:");
        testHashMap(new ProbeHashMap<Integer, String>(100, 109345121, 0.5));
    }

    private static void testHashMap(AbstractHashMap<Integer, String> map) {
        Random random = new Random();
        long startTime, endTime, duration;

        System.out.println("Adding elements to the map...");
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            map.put(random.nextInt(1000000), "Value" + i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Time taken to add elements: " + duration + " ms");

        System.out.println("Searching for elements in the map...");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            map.get(random.nextInt(1000000));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Time taken to search elements: " + duration + " ms");

        System.out.println("Removing elements from the map...");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            map.remove(random.nextInt(1000000));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Time taken to remove elements: " + duration + " ms");
    }
}
