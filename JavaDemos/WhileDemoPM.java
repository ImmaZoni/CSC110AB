import java.util.*;

public class WhileDemoPM
{
	public static void main(String[ ] args)
	{
		Scanner kb = new Scanner(System.in);

		//prompt the user to enter a non-negative integer
		System.out.print("Please enter a non-negative integer:  ");
		int num = kb.nextInt();

		while (num < 0)     //bad - its negative...   NOTE - no ; here...
		{
			System.out.print("I said NON-negative.  Reenter:  ");
			num = kb.nextInt();    //make them change the value of num....do this LAST
		}

		System.out.println("\n\nThe square root of your number is:  " + Math.sqrt(num));

	}
}
