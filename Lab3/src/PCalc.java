/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 228
 * Section: 015
 * Username: moksi
 * Date: 2024-02-24
 */
public class PCalc {
    public static int multiply(int m, int n) {
        if (m == 0 || n == 0) {
            return 0; // zero check (product will be zero regardless)
        } else if (n > 0) {
            return m + multiply(m, n - 1); // Recursive case: add m to the product of (m, n-1)
        } else {
            return -multiply(m, -n); // If n is negative, negate the product of (m, -n)
        }
    }
}