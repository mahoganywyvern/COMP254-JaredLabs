import java.util.Scanner;

/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 228
 * Section: 015
 * Username: moksi
 * Date: 2024-02-24
 */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int m: ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter int n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int product = PCalc.multiply(m, n);
        System.out.println("Product of " + m + " and " + n + " is: " + product);


        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        if (PCheck.isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        FFinder.find("C:\\Users\\moksi\\OneDrive\\Documents\\WINTER 20240", "foundme.txt");
        }
    }
