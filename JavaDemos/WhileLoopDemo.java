/*	while loops are used to check if a certain condition is true
	 - there are 3 parts (see below)
	 - it checks the condition at the TOP of the loop.
	 - so, while loops should be used in situations where they might want
	   to go into the loop 0 times.
	        - example: checking for errors.  If user makes an error, inform them and
	          make them correct it.   But they might make an error 0 times, so while
	          loops are good.  So only inform them "while" they have made an error.
	        - example: checking a CONDITION.   Open a file and read/process all the
	          lines in it.  But there might be 0 lines.   So only read/process "while"
	          there are more lines.
	 - BE CAREFUL that you do not have an infinite loop
*/

import java.util.*;

public class WhileLoopDemo
{
	public static void main(String[ ] args)
	{
		//declare a Scanner
		Scanner kb = new Scanner(System.in);

		int numErrors = 0;
/*
		//PART1:  give it an initial value
		//ask the user to enter a non-negative number
		System.out.print("Please enter a non-negative number:   ");
		double num = kb.nextDouble();

		//make them do it right!!  If they screw up, make them try it again
		while (num < 0)     //PART2 - check the value     (no semicolon)
		{
			numErrors++;    // numErrors = numErrors + 1;
			System.out.print("You entered a negative number, Fool!!   Re-enter:   ");
			num = kb.nextDouble();   //PART3: have them change the value (LAST THING IN THE LOOP)
		}

		//print its square root
		System.out.println("\nIts square root is:   " + Math.sqrt(num));
		System.out.println("There were " + numErrors + " illegal input(s)");
*/
		//------------------------------------------------------
		//Example2 - as the user to enter positive numbers; keep track of the total
		int total = 0;
		int howMany = 0;

		System.out.print("\n\n\nPlease enter an integer (negative to stop):  ");
		int myInt = kb.nextInt();     //PART1 - initial value

		while (myInt >= 0)      //PART2 - keep going "while" input is >= 0
		{
			howMany++;       //keep track of how many   (called the "counter")
			total = total + myInt;    //keep track of total     total+=myInt   (called "accumulator"
																					//						  or "running total:")

			System.out.print("\n\n\nPlease enter another integer (negative to stop):  ");
			myInt = kb.nextInt();     //PART3: get another value
		}

		System.out.println("\nThey entered " + howMany + " ints, totalling " + total);



	}
}
