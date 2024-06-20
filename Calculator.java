/*This is a program designed to help the user perform basic arithmetic operation like addittion, subtraction, multiplication and division.
In this program, the user will be requested to input the first number, the arithmetic operator the user desires to use and the second number.
Then the correct answer will be provided depending on what the user entered into the program.*/

//Importing scanner from java util
import java.util.Scanner;
//Creating a class
public class Calculator {

    //Main method
    public static void main(String[]args){

     //Craeting an object of scanner class
     Scanner scanner = new Scanner(System.in);

     //Request user for the first number
     System.out.println("Please enter the first number:");//Prompted the user to enter the first number

     //getting the first number
     double number1 = scanner.nextDouble();//Storing the entered number into the object created

     //Request user to enter the arithmetic operator desiered to be used
     System.out.println("Please enter the arithmetic operator:");//Prompted the user to enter the operator

     //getting the operator
     char operator = scanner.next().charAt(0);//Storing the entered operator into the object created

     //Request user for the second number
     System.out.println("Please enter the second number:");//Prompted the user to enter the first number

     //getting the second number
     double number2 = scanner.nextDouble();//Storing the entered number into the object created

     //Closing scanner to prevent leakage
     scanner.close();

     double ans;

    //The calculation is performed depending on the users input
    switch(operator){
        //If the user uses the subtraction operator
        case '-':
            ans = number1 - number2;
            //The output will be displayed as follows
            System.out.println("The answer is:" + number1 + " - " + number2 + " = " + ans);
            break;

        //If the user uses the divison operator
        case '/':
            ans = number1 / number2;
            //The output will be displayed as follows
            System.out.println("The answer is:" + number1 + " / " + number2 + " = " + ans);
            break;

        //If the user uses the multiplication operator 
        case '*':
            ans = number1 * number2;
            //The output will be as follows
            System.out.println("The answer is:" + number1 + " * " + number2 + " = " + ans);
            break;

        //If the user uses the addittion operator
        case '+':
            ans = number1 + number2;
            //The output will be as follows
            System.out.println("The answer is:" + number1 + " + " + number2 + " = " + ans);
            break;

        //If the user enters any other different operator apart from +,-,/,* 
        default:
            //It will be an invalid entry
            System.out.println("This is an invalid entry");                
    }

}
}