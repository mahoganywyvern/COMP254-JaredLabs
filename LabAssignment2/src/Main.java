import java.util.Random;
/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 228
 * Section: 015
 * Username: moksi
 * Date: 2024-02-11
 */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Choose representative values of the input size
        int[] inputSizes = {1, 10, 100, 1000, 10000, 100000};

        // Run experiments for each input size
        for (int n : inputSizes) {
            // Generate random input array of size n
            double[] input = generateRandomArray(n);

            // Measure the running time of prefixAverage1
            long startTime = System.currentTimeMillis();
            PrefixAverage.prefixAverage1(input);
            long endTime = System.currentTimeMillis();
            long duration1 = endTime - startTime;

            // Measure the running time of prefixAverage2
            startTime = System.currentTimeMillis();
            PrefixAverage.prefixAverage2(input);
            endTime = System.currentTimeMillis();
            long duration2 = endTime - startTime;

            // Output the results
            System.out.println("Input size: " + n);
            System.out.println("prefixAverage1 running time: " + duration1 + " ms");
            System.out.println("prefixAverage2 running time: " + duration2 + " ms");



            System.out.println();


        }
    }
    private static double[] generateRandomArray(int size) {
        double[] array = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

}