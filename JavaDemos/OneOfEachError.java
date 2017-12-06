//This program shows all 3 types of errors

import java.util.*;

public class OneOfEachError
{
	public static void main(String[ ] args)
	{
		//declare a Scanner
		Scanner kb = new Scanner(System.in);

		//prompt user and get input
		System.out.print("Please enter x:   ");
		int x = kb.nextInt();
		System.out.print("Please enter y:   ");
		int y = kb.nextInt();

		//calculate quotient and print it
//		System.out.println("\nx divided by y is:  "  (x/y));   //syntax error - will not compile
//		System.out.println("\nx divided by y is:  " + (x/y));     //logic error - we lose decimals
//		System.out.println("\nx divided by y is:  " + (y/x));     //logic error - set up wrong
		System.out.println("\nx divided by y is:  " + (x/(double)y));   //now seems to work

		//EXCEPT - what if y is input as 0?
		System.out.println("\nx divided by y is:  " + (x/y));   //runtime error - int/int where denom is 0
	}
}
