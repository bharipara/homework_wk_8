package homeworkwk8;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 *
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

public class P11_EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        //declare variable
        int lastDigit;
        int sum;
        //loop to repeat the process

        for (sum = 0; number != 0; number /= 10) {
            lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                sum += lastDigit;

            }

        }
        return sum;
    }

    public static void main(String[] args) {
        //declare variable

        int number = 0;
        int sumofEvenDigits = 0;

        Scanner scanner = new Scanner(System.in);
        // read inputs

        System.out.println("Enter an integer number :");
        number = scanner.nextInt();

        // find sum of digits of number

        sumofEvenDigits =getEvenDigitSum(number);
        // disolay result

        System.out.println("The sum for even digit of " + "the number" + number + "=" + sumofEvenDigits);

        //close scanner class object

        scanner.close();
        }
    }

