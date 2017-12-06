// This demo will (hopefully) show constants
// Pretend...this is a HUGE program to calculate taxes

// taxRate is supposed to be CONSTANT.   It should not change in your
// program (even accidentally).

// define it as a constant.   3 things to remember:
//       1)  keyword is "final"     so       final double taxRate = .32;
//       2)  every programmer always defines constants in UPPERCASE
//       3)  constants are defined FIRST so they are easy to find and change

public class ConstantDemo
{
	public static void main(String[ ] args)
	{
		//define a constant
		final double TAXRATE = .32;

		//define an int
		int numDependents;



		// ...10,000 more lines... taxRate is used 20 times
		//          taxRate variable in line 8234
		//          taxRate variable in line 9123 instead of .32 in line 9123
		//          etc

		// taxRate = 0;     //by accident   ILLEGAL because its constant

		// ...10,000 MORE lines... taxRate is used 15 times


	}
}








