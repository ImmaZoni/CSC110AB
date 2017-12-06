/*
	The logical operators are:

		&&   means "and"	both sides have to evaluate to true
				it is like "and" in English -   "it is Thursday and it is snowing"  (False)
		        example: if (x>5 && x<8)
		||		means "or"		one side or the other (or both) have to evaluae to true
		  		this is called the "inclusive or" since both can evaluate to true
		  		it is like "or" in English -   "it is Thursday or it is snowing"  (true on 9/6/17)
		  		example: if (age>21 || name.equals("Trump"))  //note: you cannot use == with classes
		!		means "not"
				example:	"my age is not 21"
								could be (myAge != 21)   or could be    !(myAge == 21)
*/

import java.util.*;

public class LogicalOpsDemo
{
	public static void main(String[ ] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Please enter x and y (as integers)  ");
		int x = kb.nextInt();
		int y = kb.nextInt();

		System.out.println("\nx is " + x + "\t\ty is " + y);

		if (x%2 == 0 && y%2 == 0)
			System.out.println("both x and y are even");

		if (x > 0 || y > 0)
			System.out.println("at least one is positive");

		if ( !(x<0) )        //probably better as   if (x >= 0) but want to show !
			System.out.println("x is not negative");
	}

}
