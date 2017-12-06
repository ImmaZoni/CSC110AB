//This will demonstrate how to get keyboard input using
//the Scanner class

//import java.util.Scanner;     //now it "sees" Scanner class
import java.util.*;      //now it "sees" EVERYTHING in java.util

public class UsingScanner
{
	public static void main(String[ ] aergssfasdfsd)
	{
		//create a new instance of a Scanner
		//connect it to the keyboard (System.in)
		Scanner kb = new Scanner(System.in);

		//tell it to do things
		System.out.print("Please enter your name:  ");
		String name = kb.nextLine();

		System.out.println("name is:  " + name);


/*		//"prompt" the user to enter their age (on same line)
		System.out.print("Please enter your age:  ");
		int age = kb.nextInt();

		System.out.print("\nPlease enter your gpa:  ");
		double gpa = kb.nextDouble();

		System.out.println("\n\nage is: " + age + "\tgpa is: " + gpa);
*/
	}
}
