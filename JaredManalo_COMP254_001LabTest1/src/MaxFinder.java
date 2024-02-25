/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-02-21
 */
public class MaxFinder {

    public static int findMax(int[] A) {
        long startTime = System.nanoTime(); // runtime START
        int result = findMaxRecursive(A, A.length - 1);
        long endTime = System.nanoTime(); // runtime END
        long duration = endTime - startTime; // runtime TOTAL
        System.out.println("Runtime: " + duration + " nanoseconds"); //runtime PRINT
        return result;
    }


    private static int findMaxRecursive(int[] A, int index) {
        if (index == 0) {
            return A[0];
        }
        return Math.max(A[index], findMaxRecursive(A, index - 1));
    }
}
