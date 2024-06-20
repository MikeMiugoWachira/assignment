/*This is a program designed to calculate the number of characters of the name entered by the user and
 determine if the users age is odd or even depending on the age number entered. */

//Importing scanner class from java util package
import java.util.Scanner;
//Creating a class
public class Details {
    //Main method
    public static void main(String[]args){
        //Creating object of scanner class
        Scanner scanner = new  Scanner(System.in);
        
    

        //Request user for input name
        System.out.println("Please enter your name:");//Prompted the user to enter name

        //getting name
        String name = scanner.nextLine();//Storing the entered name into the object created

        //Request user for current age
        System.out.println("Please enter your current age:");//Prompted the user to enter current age
        //getting age
        int age = scanner.nextInt();//Storing the entered age into the object created

        //Closing scanner to prevent leakage
        scanner.close();

        //Calculating the number of characters in the name
        int numCharacters = name.length();

        //Checking if the age is odd or even
        String ageType = (age % 2 == 0)? "Even" : "Odd" ;

        System.out.println("The length of your name is"+ " " + numCharacters + " " + "and your current age is"+ " " + ageType + " " + "number");

    }

}