/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 228
 * Section: 015
 * Username: moksi
 * Date: 2024-02-11
 */
/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.Arrays;

/**
 * Demonstration of algorithms for testing element uniqueness.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class Uniqueness {

    public static void main(String[] args) {
        // Initial values for n
        int nUnique1 = 1;
        int nUnique2 = 1;

        // Time limit in milliseconds (1 minute)
        final long timeLimit = 60000;

        // Increment factor for array size
        final int incrementFactor = 100000000;

        // Binary search to find the maximum effective value of n for each algorithm
        while (true) {
            // Generate data for both algorithms
            int[] data1 = generateRandomArray(nUnique1);
            int[] data2 = Arrays.copyOf(data1, data1.length); // Create a copy for unique2 method

            // Measure the running time of unique1
            long startTime1 = System.currentTimeMillis();
            Uniqueness.unique1(data1);
            long endTime1 = System.currentTimeMillis();
            long duration1 = endTime1 - startTime1;

            // Measure the running time of unique2
            long startTime2 = System.currentTimeMillis();
            Uniqueness.unique2(data2);
            long endTime2 = System.currentTimeMillis();
            long duration2 = endTime2 - startTime2;

            // Check if both algorithms run within the time limit
            if (duration1 <= timeLimit)
                nUnique1 += incrementFactor;
            else
                break;

            if (duration2 <= timeLimit) {
                nUnique2 += incrementFactor;
                System.out.println("value of n for unique1: " + (nUnique1 - incrementFactor) +" duration ms:"+(duration1));
                System.out.println("value of n for unique2: " + (nUnique2 - incrementFactor) +" duration ms:"+(duration2));
            }
            else
                break;
        }

        // Output the results
        System.out.println("Maximum effective value of n for unique1: " + (nUnique1 - incrementFactor));
        System.out.println("Maximum effective value of n for unique2: " + (nUnique2 - incrementFactor));
    }

    /** Returns true if there are no duplicate elements in the array. */
    public static boolean unique1(int[] data) {
        int n = data.length;
        for (int j=0; j < n-1; j++)
            for (int k=j+1; k < n; k++)
                if (data[j] == data[k])
                    return false;                    // found duplicate pair
        return true;                           // if we reach this, elements are unique
    }

    /** Returns true if there are no duplicate elements in the array. */
    public static boolean unique2(int[] data) {
        int n = data.length;
        int[] temp = Arrays.copyOf(data, n);   // make copy of data
        Arrays.sort(temp);                     // and sort the copy
        for (int j=0; j < n-1; j++)
            if (temp[j] == temp[j+1])            // check neighboring entries
                return false;                      // found duplicate pair
        return true;                           // if we reach this, elements are unique
    }
    // Helper method to generate a random array of integers
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }
        return array;
    }

}
