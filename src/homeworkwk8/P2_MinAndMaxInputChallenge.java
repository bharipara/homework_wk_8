package homeworkwk8;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 *         and maximum number the user has entered.
 *         -Before the user enters the number, print the message Enter number:
 *         -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 *         number.
 *        Hint:
 *         -Use an endless while loop.
 *         -Create a class with the name MinAndMaxInputChallenge.
 */
public class P2_MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        char choice;

        do {
            System.out.print("Enter the number : ");
            number = scanner.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }

}
