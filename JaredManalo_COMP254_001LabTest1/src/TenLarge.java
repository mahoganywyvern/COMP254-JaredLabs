/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-02-21
 */

public class TenLarge {

    public static int[] findTenLargest(int[] array) {
        long startTime = System.nanoTime(); // runtime START

        int[] BiggestBoys = new int[10]; // Array to store indices of the largest elements
        for (int i = 0; i < 10; i++) {
            BiggestBoys[i] = -1; // Initialize with invalid indices
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (BiggestBoys[j] == -1 || array[i] > array[BiggestBoys[j]]) {
                    // If the current element is larger than the one at the current index
                    // or if the index is invalid, replace it with the current index
                    shiftIndices(BiggestBoys, j); // Shift indices to make room for the new one
                    BiggestBoys[j] = i; // Update index of largest elem
                    break; // Move next elem in array
                }
            }
        }

        long endTime = System.nanoTime(); // runtime END
        long duration = endTime - startTime; // runtime TOTAL
        System.out.println("Runtime: " + duration + " nanoseconds");

        return BiggestBoys;
    }

    private static void shiftIndices(int[] indices, int startIndex) {
        for (int i = indices.length - 1; i > startIndex; i--) {
            indices[i] = indices[i - 1]; // Shift indices to the right
        }
    }
}
