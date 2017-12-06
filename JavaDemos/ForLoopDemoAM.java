//This program runs many for loops...

public class ForLoopDemoAM
{
	public static void main(String[ ] args)
	{
/*		//for loop that prints all the numbers from 1-100
		for(int i=1; i<101; i++)    //or could check that i<=100
		{
			System.out.print(i + "  ");   //don't need {}'s if only 1 statement
		}

		//for loop that prints every 5th number from 0-100 (0,5,10,15,...100)
		for (int i=0; i<=100; i++)   //go through EVERY number 0-100
			if (i%5==0)						//only print those that are evenly divisible by 5
				System.out.println(i);

		//for loop that prints every 5th number from 0-100 (0,5,10,15,...100)
		for (int i=0; i<=100; i=i+5)     //go up 5 at a time   (i+=5)
			System.out.println(i);

		//print character #0 up to character #127
		for (int i=0; i<128; i++)
			System.out.println("character # " + i + " is " + (char)i);

		//print character #7 10 times (ring system bell)
		for (int i=1; i<=10; i++)
			System.out.println((char)7);

		//print something 0 times!!!!!   (Example)
		for (int i=10; i<6; i++)
			System.out.println(i);

		//print something infinite times!
		for (int i=0; i>=0; i++)
		{
			System.out.println("\n" + i);
			System.out.println("bored yet?");
		}

		//print the numbers from 10 DOWN to 6
		for (int i=10; i>=6; i--)
			System.out.println(i);
*/
		//use a loop inside a loop
		for (int i=1; i<=6; i++)     //1 to 6
			for (int j='A'; j<=69; j++)    //A to E
				System.out.println(i + "" + (char)j);

		//print the points in the first quadrant (only 1-5 of x and y)
		for (int x=1; x<=5; x++)
			for (int y=1; y<=5; y++)
				System.out.println("(" + x + ", " + y + ")");

	}




}
