// Here is an example of the type of thing that could be on the test...
// Choose View pull-down menu --> turn Line Numbers ON
// Take a look at the comments AFTER the program for example questions

import java.util.*;

public class Test1Example
{
	public static void main(String[ ] args)
	{
		//(SECTION1) declare constants and variables
		final double PAYRATE = 13.50;

		Scanner kb = new Scanner(System.in);
		double a = 2.3;
		String name = "Joe";
		int  x, y, z;

		String answer;

		//(SECTION2) code - tell what each of these S.O.P.'s will print
		x = 2;
		y = 7;
		z = 4;

		System.out.println(y/x);						//__________
		System.out.println((double)y/x);				//__________
		System.out.println(y%z);						//__________
		System.out.println(x+y*z);						//__________
		System.out.println(name + x + z);  //tricky		//__________
		System.out.println(x++);						//__________
		System.out.println(x);							//__________
		System.out.println(++z);						//__________
		System.out.println(z);							//__________

		//(SECTION3) prompt the user for a String and an int, then use them
		System.out.print("Please enter a String: ");
		String str = kb.nextLine();
		System.out.print("Please enter an int: ");
		int theInt = kb.nextInt();
		System.out.println("character number " + theInt + " in " + str + " is: " + str.charAt(theInt));

		//(SECTION4) do some logic
		double hrsWorked = 10;
		double pay = hrsWorked * PAYRATE;
		System.out.println("pay is: \t" + pay);			//__________






		//(SECTION5) reset variables, then do some if-else logic
		x = 2;
		y = 7;
		z = 4;

		if (y < 7 || x+2 > 12)
			answer = "aa";
		else
			answer = "bb";
		System.out.println(answer);				//__________

		if (y == 4 && x > 1)
			if (z > 10)
				answer = "cc";
			else
				answer = "dd";
		System.out.println(answer);				//__________

	}
}

//Example types of questions:
//		1.		In which line is defined a variable that can hold a decimal?
//		2.		In which line is defined a constant?
//		3.		In which line is typecasting used?
//		4.		In which line is a tab used?
//		5.		In which line is a String created?
//		5.		What will be printed in SECTION2, SECTION4, and SECTION5?
//		8.		Make any change you want in SECTION2 that would cause a syntax error.
//		9.		Make a change in SECTION4  that would cause a logic error.
//		10.		Describe what input would cause a runtime error in SECTION3.

/*  There will also be:
         - some short answer questions that you should already know
                   (Ex: When you compile MyProg.java, what file is created?)
         - name the 5 phases of the Software Engineering Lifecycle Model."  Which do you think is
                   the most important and why?
         - write a program on paper.
*/
