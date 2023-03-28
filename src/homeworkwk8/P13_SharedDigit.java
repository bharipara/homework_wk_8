package homeworkwk8;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class P13_SharedDigit {

        public static void main(String[] args) {
            System.out.println(hasSharedDigit(9,99));
        }
        //write method named hasSharedDigit with two parameters
        public static boolean hasSharedDigit(int one ,int two){
            int modulusOne = one % 10;
            int modulusTwo =  two % 10;
            int divisionOne = one / 10;
            int divisionTwo = two / 10;
            // check number within the range or not
            //if number within range then return true if not then return false
            if ((one < 10  || one > 99) || (two < 10 || two > 99)){
                return false;
            }else if (one == two){
                return true;

            }else if (modulusOne==modulusTwo){
                return true;
            }else if(divisionOne == divisionTwo){
                return true;

            }else if(divisionOne == modulusTwo){
                return true;
            }else if(divisionTwo == modulusOne){
                return true;
            }else{
                return false;
            }

        }
    }

