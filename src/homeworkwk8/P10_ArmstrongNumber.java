package homeworkwk8;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class P10_ArmstrongNumber {
    public static boolean ArmstrongNumber (int number){

        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            return true;
        else
            return false;
    }


    public static void main (String [] args){

        int integer;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Armstrong Number: ");
        integer = scanner.nextInt();

        if (ArmstrongNumber(integer)) {
            System.out.println("The number " + integer + " is an Armstrong number");
        }
        else {
            System.out.println("The number " + integer + " is NOT an Armstrong number");
        }

    }
}
