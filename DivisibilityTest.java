/*This is a program designed to help kids learn divisibiliy test of numbers of integers.
The program will request the kid to enter a number then it will check whether the given number is divisible by integers in the range of 0-9.
Then the program will provide an answer with a specific reason for arriving to that answer  */

//Importing scanner class from java util package
import java.util.Scanner;
//Creating a class
public class DivisibilityTest {
    //Main method
    public static void main(String[]args){
        //Creating object of scanner class
        Scanner scanner = new  Scanner(System.in);

        //Request the kid to enter a number
         System.out.println("Please enter a number:");//Prompted the kid to enter the number
         //getting the number
         int number = scanner.nextInt();

         //Closing the scanner to prevent leakage
         scanner.close();

         //Divisibility of numbers in the range of 0 to 9
         for(int i = 0; i <= 9; i++){
            if(i == 5 && (number % 10 == 0 || number % 10 == 5)){
                System.out.println("The number is divisible by" + " " + i + " " + "because it is ending with" + " " + number % 10);
            }
            else{System.out.println("The number is divisible by" + " " + i);
            }
         }
    }
    //Checking divisibility of a number by another number
    public static boolean isDivisible(int number, int divisor){
        return number % divisor == 0;
    }
}

    
