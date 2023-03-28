package homeworkwk8;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class P9_FibonacciNumber {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        int counter = 0;

        // Iterate till counter is N
        while (counter < 10) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}