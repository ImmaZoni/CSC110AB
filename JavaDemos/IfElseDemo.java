/*
if statements are like this:   	if(  <something evaluates to true>      )
													{
														do something;
														do something;
														do something;
													}

It would just skip over the do something's if what was inside the ( )'s was false

But ... if you want it to do something else if the ( )'s evaluate to false
use an if-else like this:		if(        )
	`											{
													do something;
													do something;
													do something;
												}
												else
												{
													do something else;
													do something else;
												}

												if (x < 4)
													System.out.println(x);    //do ONE thing (don't need { }'s)
												else
												{
													System.out.println("hello");
													System.out.println("hi");
												}

												if (x >= 0)
													System.out.println("x could be > 0");
													System.out.println("x could be == 0");

NOTE:
 - inside the ( )'s is something that evaluates to true or false
 - usually RELATIONAL OPERATORS are used:
 						if (x < 3)		<--  less than
 						if (x <= 3)    <--  less than or equal to
 						if(x > 3)       <--  greater than
 						if(x >= 3) 	<--  greater than or equal to
                      	if(x == 3)     <--  equal to, comparison operator (don't use =)
                     	if (x != 3)     <--  not equal to
  - you should indent inside if and if-else statements
  - if there is only one statement inside the if or if-else, you don't need the { }'s
  - DON'T DO THIS:     		if (x < 3);     //NO SEMICOLON HERE
  												System.out.println("x is less than 3");
*/
import java.util.*;

public class IfElseDemo
{
	public static void main(String[ ] args)
	{
		//define a Scanner
		Scanner kb = new Scanner(System.in);

		//prompt user and get input
		System.out.print("Please enter x:   ");
		int x = kb.nextInt();
		System.out.print("Please enter y:   ");
		int y = kb.nextInt();

		//check if x is >= 0
		if (x >= 0)    // NEED { }'s IF GOING TO DO 2 OR MORE THINGS INSIDE IF
		{
			System.out.println("x could be > 0");
			System.out.println("x could be == 0");
		}

/*
		//calculate quotient and print it - only if denominator is not zero
		(y != 0)
			System.out.println("\nx divided by y is:  " + (x/(double)y));   //now seems to work

		//should we print the plural?
		System.out.print("\nPlease enter how many dollars you have: ");
		int numDollars = kb.nextInt();

		if (numDollars == 1)
			System.out.println("you have " + numDollars + " dollar");
		else
			System.out.println("you have " + numDollars + " dollars");
*/
	}
}
