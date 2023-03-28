package homeworkwk8;

/**
 * 8. Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class P8_RightAngleTriangle {
    public static void main(String[] args)

    {
        int a, b;

        System.out.print("Printing Right angle triangle using @ in 7 lines");
        for (a = 0; a < 7; a++) {

            for (b = 0; b <= a; b++) {
                // printing @ triangle
                System.out.print("@ ");
            }

            // end-line
            System.out.println();
        }
    }
}

