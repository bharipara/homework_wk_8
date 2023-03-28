package homeworkwk8;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */


public class P14_DiamondPattern {


        public static void main(String[] args) {
            //Scanner using for reading input from console
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter N : ");
            int n = scanner.nextInt();
            System.out.println("Enter Symbol : ");

            char c = scanner.next().charAt(0);
            // Declare the variable
            int i = 1;
            int j;
            //Repeat the process using while loop
            while (i <= n) {
                j = 1;
                while (j++ <= n-i) {
                    System.out.print(" ");
                }
                j = 1;
                while (j++ <= i*2 -1) {
                    System.out.print(c);
                }
                System.out.println();
                i++;

            }
            i = n - 1;
            while (i > 0) {
                j = 1;
                while (j++ <= n - i) {
                    System.out.print(" ");
                }
                j = 1;
                while (j++ <= i * 2 - 1) {
                    System.out.print(c);
                }
                System.out.println();
                i--;
                //Closing the scanner
                scanner.close();
            }

        }
    }

