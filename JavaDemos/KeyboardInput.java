//This demo shows how to set up an instance of the Scanner class to
//read input from the keyboard

import java.util.Scanner;
import java.util.*;    // this is java.util.EVERYTHING

public class KeyboardInput
{
	public static void main(String[ ] args)
	{
		//create a new instance of the Scanner class and
		//connect it to the keyboard (System.in)
		Scanner kb = new Scanner(System.in);






		// To get input from the keyboard, use a class called Scanner
		// create an instance of a Scanner passing "standard input" (the keyboard) to its constructor

		/* There are 4 input methods that you will use often
			.nextInt() 		skips over "white space" (spaces, tabs, newlines)
									and returns the int that is next on the input stream
									LEAVES THE ENTER ON THE INPUT STREAM
			.nextDouble()	skips over "white space" (spaces, tabs, newlines)
										and returns the double that is next on the input stream
										LEAVES THE ENTER ON THE INPUT STREAM
			.nextLine()		returns the next line (up to an ENTER)
									(throws away the ENTER)
			.next()				skips over white space
									returns the next "token" (word) on the input stream
		*/

		System.out.print("Please enter your name: " );   //"prompt"
		String name = kb.nextLine();

		System.out.print("Please enter your age:  ");
		int age = kb.nextInt();

		System.out.print("Please enter your gpa:  ");
		double gpa = kb.nextDouble();

//		kb.nextLine();   //"Flush" the leftover ENTER off of the input stream  **********

//		System.out.print("Please enter your major: ");
//		String major = kb.nextLine();

		System.out.println("\n\nName: " + name + "\tage: " + age + "\tgpa: " + gpa);
//		System.out.println("\n\nName: " + name + "\tage: " + age + "\tgpa: " + gpa + "\tmajor: " + major);
	}
}
