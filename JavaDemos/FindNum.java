//This program will hard-code a number, then use a for loop to
//look for it.

public class FindNum
{
	public static void main(String[ ] args)
	{
		int waldo = 5786;   //what to look for!

		//get the time before the loop runs
		long startTime = System.nanoTime();

		boolean foundIt = false;
		for (int i= 1; i<=200000 && !foundIt; i++)    //hidden in 1-200,000
		{
			System.out.println("trying " + i);
			if (i == waldo)
			{
				System.out.println("<=== FOUND IT");
				foundIt = true;        //break;
			}
		}

		//get the time after the loop runs
		long endTime = System.nanoTime();

		//how long did it take?
		System.out.println("It took: " + (endTime-startTime)/1000000000. + " seconds");

	}
}
