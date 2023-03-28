package homeworkwk8;

/**
 * 15. Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

public class P15_LeftAngleTriangle {


        public static void main(String[] args) {
            //calling printLeftTriangle method
            printLeftTriangle(7);
        }
        //Create method printLeftTriangle
        public static void printLeftTriangle(int a){
            //Iteration statement using nested loop
            for (int i=0; i<a+1 ; i++){
                for (int j=0; j<i; j++){
                    System.out.print(" * ");
                }
                System.out.println(" ");
            }
        }
    }

