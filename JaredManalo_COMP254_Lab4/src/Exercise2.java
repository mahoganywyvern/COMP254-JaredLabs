/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 254
 * Section: 003
 * Username: moksi
 * Date: 2024-03-08
 */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Stack;
public class Exercise2 {

    // Method to transfer elements from stack S to stack T
    public static void transfer(Stack<Integer> S, Stack<Integer> T) {
        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }

    // Method to test the transfer method
    public static void main(String[] args) {
        Stack<Integer> stackS = new Stack<>();
        Stack<Integer> stackT = new Stack<>();

        // Push some elements onto stack S
        stackS.push(1);
        stackS.push(2);
        stackS.push(3);
        stackS.push(4);

        // Transfer elements from stack S to stack T
        transfer(stackS, stackT);

        // Print elements of stack T (the transferred elements)
        System.out.println("Elements in stack T after transfer:");
        while (!stackT.isEmpty()) {
            System.out.println(stackT.pop());
        }
    }
}