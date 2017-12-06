//do-while loops will check at the BOTTOM of the loop.  So the code HAS to
//go through the loop at least once.  do-while loops are used for menus and
//games

import java.util.*;

public class DoWhileMenuDemo
{
	public static void main(String[ ] args)
	{
		//define variables
		char letter;
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.println("Please enter 2 INTS (separated by spaces)");
		int first = kb.nextInt();
		int second = kb.nextInt();

		do
		{
			//show the menu
			System.out.println("\nPlease choose an option");
			System.out.println("\tA\tAdd them");
			System.out.println("\tB\tSubtract them");
			System.out.println("\tC\tMultiply them");
			System.out.println("\tD\tDivide them");
			System.out.println("\tE\tFind the remainder");
			System.out.println("\tF\tInput 2 different numbers");
			System.out.println("\tG\tExit");

			//get their input
			String userChoice = kb.next();	//there is no kb.nextChar()...
			letter = userChoice.charAt(0);	//...so we get a String, then look at first character
/*
			//logic will branch depending on their input
			if (letter == 'a' || letter == 'A')
				System.out.println(first + " + " + second + " = " + (first + second));
			else if (letter == 'b' || letter == 'B')
				System.out.println(first + " - " + second + " = " + (first - second));
			else if (letter == 'c' || letter == 'C')
				System.out.println(first + " * " + second + " = " + (first * second));
			else if (letter == 'd' || letter == 'D')
				System.out.println(first + " / " + second + " = " + ((double)first / second));
			else if (letter == 'e' || letter == 'E')
				System.out.println(first + " % " + second + " = " + (first % second));
			else if (letter == 'f' || letter == 'F')
			{
				System.out.println("Please enter 2 other ints (separated by spaces)");
				first = kb.nextInt();
				second = kb.nextInt();
			}
			else if (letter == 'g' || letter == 'G')
				;     //don't do anything - let the bottom of the loop handle the exit
			else     //illegal
				System.out.println("Illegal input - try again!");
*/
			//OR...you could use a switch statement
			switch(letter)	//like if(letter == ......)
			{
				case('A'):
				case('a'):		System.out.println(first + " + " + second + " = " + (first + second));
									break;

				case('B'):		System.out.println(first + " - " + second + " = " + (first - second));
									break;

				case('C'):		System.out.println(first + " * " + second + " = " + (first * second));
									break;

				case('D'):		System.out.println(first + " / " + second + " = " + ((double)first / second));
									break;

				case('E'):		System.out.println(first + " % " + second + " = " + (first % second));
									break;

				case('F'):		System.out.println("Please enter 2 other ints (separated by spaces)");
									first = kb.nextInt();
									second = kb.nextInt();
									break;
				case('G'):		;     //don't do anything - let the bottom of the loop handle the exit
									break;

				default:		System.out.println("Illegal input - try again!");

			}  //end of switch

		} while (letter != 'g' && letter != 'G');


	}
}
