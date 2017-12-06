//Here is a driver program that will call OurMathFunctions
//It asks the user for a double, calculates the square root

import java.util.*;

public class TheDriver
{
	public static void main(String[ ] args)
	{
		//define a Scanner
		Scanner kb = new Scanner(System.in);

		try
		{

			System.out.print("Please enter a double:  ");
			double theNumber = kb.nextDouble();

			System.out.println("The square root is:  " +
					OurMathFunctions.calculateSqrt(theNumber));
		}
		catch (IllegalArgumentException ex)
		{
			ex.printStackTrace();
		}


		System.out.println("Program ending normally");
	}
}

