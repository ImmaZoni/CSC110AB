//This program runs many for loops...

public class ForLoopDemo
{
	public static void main(String[ ] args)
	{
/*		//for loop that prints all the numbers from 1-100
		for (int i=1; i<=100; i++)
			System.out.println(i);

		//for loop that prints every 5th number from 0-100 (0,5,10,15...100)
		for (int i=0; i<=100; i++)
			if (i%5 == 0)     //evenly divisible by 5
				System.out.println(i);

		//for loop that prints every 5th number from 0-100 (0,5,10,15...100)
		for (int i=0; i<=100; i=i+5)    //or could have i+=5
			System.out.println(i);

		for (int i=0; i<128; i++)    //print characters #0-127
			System.out.println("character #" + i + " is " + (char)i);

		for (int i=0; i<10; i++)        //"prints" char#7 10 times (i counts as 0-9)
			System.out.println((char)7);


		//this will print 0 times
		for (int i=6; i>6; i++)
			System.out.println("Hello!!");

		//this will print an infinite amount of times
		for (int i=7; i<10; i--)
		{
			System.out.println("\nhi!");
			System.out.println("boring yet?");
		}

		//this will print some very large numbers stored as shorts
		for (short i=32700; i<33000; i++)     //dont do this - use an int for YOUR loops
			System.out.println(i);

		//print all numbers from 50 down to 3 (including both)
		for (int i=50; i>=3; i--)
			System.out.println(i);

		//here are "nested" loops.
		//This will print 1A 1B 1C 1D 1E 2A 2B 2C 2D 2E 3A....6D 6E
		//Note that the outer loop starts at 1 and inner goes from A to E
		//			then the outer loop changes to 2 and inner goes from A to E
		//etc.
		for (int i=1; i<=6; i++)
			for (int j='A'; j<=69; j++)     //because char#65 is A, #66 is B, etc.
				System.out.println(i + " " + (char)j);
	*/
		//print ordered pairs that are in the lower 1st quadrant
		for  (int x=1; x<6; x++)
			for (int y=1; y<6; y++)
				System.out.println("(" + x + ", " + y + ")");


	}

}
