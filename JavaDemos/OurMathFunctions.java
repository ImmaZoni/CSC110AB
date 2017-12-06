//Here is a class that just does some Math functions
//It will not run by itself, but requires a driver (that has main)
public class OurMathFunctions
{
	public static double calculateSqrt(double theNum)
	{

		//check to see if theNum is OK (not negative)
		if (theNum < 0)
			throw new NegativeSqrtException("can't be negative");

		return Math.sqrt(theNum);
	}
}
