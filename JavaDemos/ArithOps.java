// This program illustrates arithmetic operators
// Programmer: Ken Macleish

import java.util.*;

public class ArithOps
{
	public static void main(String[ ] args)
	{
/*		// The arithmetic operators are + , - , * , / , %
		int x;
		int y;

		Scanner kb = new Scanner(System.in);



		System.out.print("Please enter x:   ");
		x = kb.nextInt();

		System.out.print("Please enter y:  ");
		y = kb.nextInt();

		//"flush" the input stream to get rid of the ENTER that was left
		kb.nextLine();

		System.out.print("Please enter your name:  ");
		String theName = kb.nextLine();


		System.out.println("\nName is: -->" + theName + "<---");

		// demo all of the arithmetic operators
		System.out.println("\n" + x + " + " + y + " is: " + (x + y));   //addition
		//System.out.println('%' + '$');

		System.out.println("\n" + x + " - " + y + " is: " + (x - y));    //subtraction

		System.out.println("\n" + x + " * " + y + " is: " + (x * y));    //multiplication

		System.out.println("\n" + x + " / " + y + " is: " + (x / y));    //division without typecasting

		System.out.println("\n" + x + " / " + y + " is: " + ((double)x / y));    //division with typecasting

		System.out.println("\n" + x + " % " + y + " is: " + (x % y));   //modulus (remainder)

		//you can add any two numbers that are numeric in nature.   This include chars, which are
		//defined as integers in the ANSI table.   You can "typecast" one type to another - this means
		//TEMPORARILY treating it as another type.  In the code      (double)x/y     typecasting is used.  x is
		//temporarily thought of as a double so the division is no longer int/int.

		//here are examples of typecasting
		System.out.println("\n" + (char)8);
		System.out.println("\n" + (char)60);
		System.out.println("\n" + (int)'@');

		//here are some "shortcut" operators
		System.out.println("\nx is: " + x);
		x++;    // MEANS   x = x + 1    (don't use x = x++     you just need the x++)
		System.out.println("\nx is: " + x);
		x *= 5;      // MEANS  x = x * 5     same idea for    x += 5 means x = x + 5;    -=   /=    %=
		System.out.println("\nx is: " + x);
*/
		int a = 8;
		System.out.println(a++);
		System.out.println("a is now:  " + a);

		int b = 23;
		System.out.println(++b);
		System.out.println("b is now:  " + b);

/*		//The precedence for arithmetic operators is the same as math
		System.out.println();
		System.out.println(4 + 3 * 5);   // 35?    19?     PEMDAS
		System.out.println((4 + 3) * 5);   // 35?    19?     PEMDAS
*/


	}
}












