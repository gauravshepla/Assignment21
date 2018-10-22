package assignment21;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 1794331
 */
public class Assignment21 {

    public static void main(String[] args) {
        Random obj = new Random();
        Scanner keyboard = new Scanner(System.in);
        int number, i, randomNo, count = 1;
        System.out.println("*************************");
        System.out.println("Welcome to Guessing Game");
        System.out.println("*************************");
        randomNo = obj.nextInt(9);
        System.out.print("Enter a number from 1 to 10: ");
        number = keyboard.nextInt();
        //elemCount = keyboard.nextInt();
        while (number != randomNo) {
            System.out.println("Try Again...");
            System.out.print("Enter a number from 1 to 10: ");
            number = keyboard.nextInt();
            count++;
        }
            System.out.println("You won! The number was " + randomNo);
            System.out.println("It took you " + count + " guesses to win.");
    }

}
