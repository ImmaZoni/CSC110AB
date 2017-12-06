//ask the user to enter 2 integers.   Then show them a menu with their options.
//The options will be what operation to do.

import java.util.*;

public class DoWhileMenuPM
{
	public static void main(String[ ] args)
	{
		//create a new instance of a Scanner
		Scanner kb = new Scanner(System.in);

		//ask the user to enter 2 ints.   Get them
		System.out.print("Please enter 2 integers:   ");
		int firstInt = kb.nextInt();
		int secondInt = kb.nextInt();

		//use a do-while loop to keep repeating the logic
		int menuChoice;
		do
		{
			//show the user a menu
			System.out.println("\nPlease choose an option");
			System.out.println("\t1\tAdd the numbers");
			System.out.println("\t2\tSubtract the numbers");
			System.out.println("\t3\tMultiply the numbers");
			System.out.println("\t4\tFirst divided second");
			System.out.println("\t5\tFirst mod second");
			System.out.println("\t6\tExit");

			//let the user input their option
			try
			{
				menuChoice = kb.nextInt();
			}
			catch(InputMismatchException eexxx)
			{
				menuChoice = -99999;   //some illegal number
				kb.nextLine();    //"flush" the input stream
			}

			//logic will branch depending on what they chose
			//  use if, else if, else if, else      -or-    switch statement
/*			if (menuChoice == 1)    //add
				System.out.println(firstInt + " + " + secondInt + " = " + (firstInt+secondInt));
			else if (menuChoice == 2)   //subtract
				System.out.println(firstInt + " - " + secondInt + " = " + (firstInt-secondInt));
			else if (menuChoice == 3)   //multiply
				System.out.println(firstInt + " * " + secondInt + " = " + (firstInt*secondInt));
			else if (menuChoice == 4)    //divide
				System.out.println(firstInt + " / " + secondInt + " = " + ((double)firstInt/secondInt));
			else if (menuChoice == 5)   //mod
				System.out.println(firstInt + " % " + secondInt + " = " + (firstInt%secondInt));
			else if (menuChoice == 6)   //exit
				;     //don't do anything.   Let the loop handle the exit   -or- could break;
			else     //usually used to check for errors
				System.out.println("Invalid option - try again");
*/

			//same logic, with a switch statement
			switch(menuChoice)   //switch based on value of menu input
			{
				case 1:  	System.out.println(firstInt + " + " + secondInt + " = " + (firstInt+secondInt));
								break;
				case 2:	System.out.println(firstInt + " - " + secondInt + " = " + (firstInt-secondInt));
								break;
				case 3:	System.out.println(firstInt + " * " + secondInt + " = " + (firstInt*secondInt));
								break;
				case 4:	System.out.println(firstInt + " / " + secondInt + " = " + ((double)firstInt/secondInt));
								break;
				case 5:	System.out.println(firstInt + " % " + secondInt + " = " + (firstInt%secondInt));
								break;
				case 6:	break;    //don't do anything
				default:	System.out.println("Invalid option - try again");
			}



		} while (menuChoice != 6);    //they dont say to exit



	}



}
