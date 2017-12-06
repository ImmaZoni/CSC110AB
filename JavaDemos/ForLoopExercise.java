// This is an exercise in writing for loops to do various things.
// Please write the for loop in Part1 and run it.
// Then add the for loop in Part2 and run it.
// etc.

public class ForLoopExercise

{
	public static void main(String[ ] args)
	{
		// PART1   *****************************************
		// You have a series of for loops below.  Look at
		// each one and try to predict what it will do.  Then uncomment
		// it and run the program to see if you are right.  Once you finish with a
		// part, you can comment it out again while you work on the next part.

		// Be sure to closely read the comments with each for loop to see how each
		// is different.

		// 1a. Try to figure out what the result will be.  Then uncomment,
		//     compile, and run.
		System.out.println("\nPart 1a");
		/*
			for (int i=0; i<=5; i++)
				System.out.println(i);
		*/
		//----------------------------------------------------
		// 1b. Try to figure out what the result will be.  Then uncomment,
		//     compile, and run.
		System.out.println("\nPart 1b");

			int total = 0;
			for (int i=0; i<3; i++)		//notice how this part differs from 1a
				total = total + (i*3)+1;
			System.out.println("total is now: " + total);

		//----------------------------------------------------
		// 1c. Try to figure out what the result will be.  Then uncomment,
		//     compile, and run.
		System.out.println("\nPart 1c");
		/*
			 for (int i=0; i>6; i++)
				System.out.println((i*3)+1);
		*/
		//----------------------------------------------------
		// 1d. Try to figure out what the result will be.  Then uncomment,
		//    compile, and run.
		System.out.println("\nPart 1d");
		/*
			 for (int i=0, x=2; i<3; i++)    //you can initialize >1 variable
			 {
				System.out.println(i*x);  //and use braces to do >1 stmt
			 }
		*/
		//----------------------------------------------------
		// 1e. Try to figure out what the result will be.  Then uncomment,
		//     compile, and run.
		System.out.println("\nPart 1e");
		/*
			 for (int i=5; i>0; i--)          	//it decrements in this example
				System.out.println(i);
		*/
		//----------------------------------------------------
		// 1f. Try to figure out what the result will be.  Then uncomment,
		//     compile, and run.
		System.out.println("\nPart 1f");
		/*
			 for (i=0; i<=5; i++)				//these are nested loops
			 	for (j=0; j<=3; j++)
			 		System.out.println(i + ", " + j);  //these are nested loops
		*/
		//----------------------------------------------------
		// 1g. Try to figure out what the result will be.  Then uncomment,
		//     compile, and run.
		System.out.println("\nPart 1g");
		/*
			boolean allDone = false;				// this is called a "flag"
			x = 6;
			while (!allDone)
			{
				System.out.println(x);
				x = x + 2;
				if (x > 8)
					allDone = true;
			 }
		*/

		// PART2   *****************************************
		// For each "section" below, put in statements that use a loop to
		// implement the functionality.  Test it by compiling and running.
		// Once you successfully implement a part, you can comment it out while you
		//    work on the next part.

		//write a for loop that prints the numbers from 7-21
		System.out.println("\nPart2a: Printing numbers from 7-21");



		//write a for loop that prints the numbers from 7-80 that are multiples of 5
		System.out.println("\nPart2b: Printing numbers from 7-80 that are multiples of 5");


		//write a for loop that prints the EVEN numbers from 20 DOWN to 2
		System.out.println("\nPart2c: Printing EVEN numbers from 20 DOWN to 2");


		//write a for loop that prints the numbers from 0-99
		System.out.println("\nPart2d: Printing numbers from 0-99");


		//write 2 NESTED for loops (a loop inside a loop) that does the following
		//   the outer loop should have i change from 0 to 9 (this will be the "ten's place")
		//   the inner loop should have j change from 0 to 9 (this will be the "one's place")
		//   inside the inner loop, print i and then "" and then j (ten's, then one's place)
		System.out.println("\nPart2e: Writing nested loops that print 00 to 99");



		//write a for loop that NEVER prints anything
		System.out.println("\nPart2f: Writing a loop that does not print anything");



		//write a for loop that runs infinitely.
		System.out.println("\nPart2g: Writing a loop that runs infinitely");


	}
}
