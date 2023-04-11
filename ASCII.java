/*
* Description: A program that prints the numerical value of a given ASCII character
*/

import java.util.Scanner;

public class ASCII {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        int ascii = ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}
