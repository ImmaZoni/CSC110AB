/* This program will ask the user to enter 2 ints.   It will
	either add them subtract them, multiply them, divide them,
	or mod them depending on which menu option is chosen
*/
import java.util.*;

public class DoWhileMenuDemoAM
{
	public static void main(String[ ] args)
	{
		//declare a Scanner to get keyboard input
		Scanner kb = new Scanner(System.in);

		//ask the user to enter 2 ints
		System.out.print("Please enter 2 integers:   ");
		int first = kb.nextInt();
		int second = kb.nextInt();

		int menuChoice;
		do
		{
			//show the user a menu
			System.out.println("\nPlease choose an option");
			System.out.println("	1	Add the numbers");
			System.out.println("\t2\tSubtract the numbers");
			System.out.println("\t3\tMultiply the numbers");
			System.out.println("\t4\tDivide the numbers");
			System.out.println("\t5\tFind the remainder");
			System.out.println("\t6\tExit");
			System.out.println();

			//get the user's choice
			try
			{
				menuChoice = kb.nextInt();
			}
			catch (InputMismatchException exxx)
			{
				menuChoice = -11111111;   //some fake value that will trigger "illegal input - try again"
				//exxx.printStackTrace();
				kb.nextLine();   //flush the input stream - read it, ignore it
			}

			//logic branches based on what the user chooses
			switch(menuChoice)
			{
				case 1:	System.out.println(first + " + " + second + " = " + (first+second));
								break;
				case 2:	System.out.println(first + " - " + second + " = " + (first-second));
								break;
				case 3:	System.out.println(first + " * " + second + " = " + (first*second));
								break;
				case 4:	System.out.println(first + " / " + second + " = " + ((double)first/second));
								break;
				case 5:	System.out.println(first + " % " + second + " = " + (first%second));
								break;
				case 6:	break;     //don't do anything - let the loop do the quit
				default:	System.out.println("Illegal input - try again");
			}
		} while ( menuChoice != 6 );



	}
}
