/*This is a program designed to compute the average marks of a student and display it on the screen.
The program will request the student to enter the marks of his or her five units.
The program will then calculate the total of the five units and get the average  */

//Importing scanner class from java util package
import java.util.Scanner;
//Creating a class
public class StudentAverage {
    //Main method
    public static void main(String[]args){
        //Creating object of scanner class
        Scanner scanner = new  Scanner(System.in);


        //Request student for marks
        System.out.println("Please enter your first unit marks:");//Prompted the student for marks
        //getting marks
        float firstmarks = scanner.nextFloat();//Storing the entered marks into the object created

        //Request student for marks
        System.out.println("Please enter your second unit marks:");//Prompted the student for marks
        //getting marks
        float secondmarks = scanner.nextFloat();//Storing the entered marks into the object created

        //Request student for marks
        System.out.println("Please enter your third unit marks:");//Prompted the student for marks
        //getting marks
        float thirdmarks = scanner.nextFloat();//Storing the entered marks into the object created

        //Request student for marks
        System.out.println("Please enter your fourth unit marks:");//Prompted the student for marks
        //getting marks
        float fourthmarks = scanner.nextFloat();//Storing the entered marks into the object created

        //Request student for marks
        System.out.println("Please enter your fifth unit marks:");//Prompted the student for marks
        //getting marks
        float fifthmarks = scanner.nextFloat();//Storing the entered marks into the object created

        //Closing scanner to prevent leakage
        scanner.close();

        //Calculating the average
        float marksAverage = (firstmarks + secondmarks + thirdmarks + fourthmarks + fifthmarks)/ 5;

        //Displaying the required result
        System.out.println("Your average marks is" + " " + marksAverage);


    }

}