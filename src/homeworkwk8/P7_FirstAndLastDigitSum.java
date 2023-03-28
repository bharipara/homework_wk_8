package homeworkwk8;

import java.util.Scanner;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 *
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 *
 * gives us 0+0 and the sum is 0.
 *
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 * gives us 5+5 and the sum is 10.
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class P7_FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit (int number){
        int firstDigit = 0;
        int lastDigit = 0;
        int i = number;

        // To find the last digit of the number : taking modulo with 10
        lastDigit = Math.abs(number % 10);

        // To find the first digit of the number
        while (number != 0) {
            firstDigit = Math.abs(number % 10);
            number /= 10;
        }
        if (i < 0)
        { return -1; }
        else
        {return firstDigit + lastDigit; }
    }


    public static void main (String [] args){

        int sumFirstandLastDigit;
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        i = scanner.nextInt();

        sumFirstandLastDigit = sumFirstAndLastDigit(i);
        if (sumFirstandLastDigit != -1) {
            System.out.println("The sum of first and last digits of number " + i + " is: " + sumFirstandLastDigit);
        }
        else {
            System.out.println("The number " + i + " is invalid. Return is: " + sumFirstandLastDigit);
        }
    }
}