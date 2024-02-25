/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-02-24
 */
public class PCheck {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true; // if string is 0-1 char long, its a palindrome
        } else {
            char firstChar = s.charAt(0);  //find first char to compare
            char lastChar = s.charAt(s.length() - 1); //find last char to compare

            if (firstChar == lastChar) {
                // If the first and last characters are equal, check the substring excluding these characters
                return isPalindrome(s.substring(1, s.length() - 1));
            } else {
                return false; // If the first/last chars are not =, not a palindrome
            }
        }
    }
}
