package homeworkwk8;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

public class P12_PrimeNumber {

            public static void main(String[] args) {
                System.out.println("Enter a number : ");
                //Scanner using for reading input from console
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                int i = 1, c= 0;
                // loop for repeat the process
                for(i=1;i<=n;i++){
                    if(n%i==0){
                        c++;
                    }
                }
                //to check num is prime or not
                if(c==2){
                    System.out.println(n+" is a PRIME no");
                }else{
                    System.out.println(n+" is a Not a prime no");
                    //closing the scanner

                    scanner.close();
                }

            }
        }



