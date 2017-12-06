import java.util.*;

public class PennyJar
{
	public static void main(String[ ] args)
	{
		//define constants (does not change in the program)
		//note:   3 things
		/*    1.   to be a constant, it should have the keyword final
		       2.   constants should be defined in all uppercase
		       3.   constants should be defined at the top of the program
		             (so they are easy to find and change)
		*/
		final int PENNIESPERDOLLAR = 100;

		//create a new instance of a Scanner
		Scanner kb = new Scanner(System.in);

		//ask the user for their name and the number of pennies
		System.out.print("Please enter your name:  ");
		String name = kb.nextLine();

		System.out.print("Please enter how many pennies:  ");
		int numPennies = kb.nextInt();

		int numDollars = numPennies/PENNIESPERDOLLAR;
		int leftover = numPennies%PENNIESPERDOLLAR;

		int numQuarters = leftover/25;
		leftover = leftover%25;     //reusing the variable!

		int numDimes = leftover/10;
		leftover = leftover%10;     //reusing the variable!

		int numNickels = leftover/5;
		leftover = leftover%5;     //reusing the variable!

		//what is now leftover is how many pennies are left

		//print the results
		System.out.println("\n\n" + name + " has ");

		if (numDollars == 1)
		{
			System.out.println(numDollars + " dollar");
			System.out.println("not enough for anything  :-( )");
		}
		else
			System.out.println(numDollars + " dollars");

		System.out.println(numQuarters + " quarters");
		System.out.println(numDimes + " dimes");
		System.out.println(numNickels + " nickels");
		System.out.println(leftover + " pennies");

	}
}








