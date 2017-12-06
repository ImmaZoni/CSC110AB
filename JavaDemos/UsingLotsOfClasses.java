//This demo will show how to use lots of different classes
//    Scanner, Random, array, and Math

import java.util.*;

public class UsingLotsOfClasses
{
	public static void main(String[ ] args)
	{
		//create a new instance of a Scanner
		Scanner kb = new Scanner(System.in);

		//ask the user to enter a "seed" for generating random numbers.
		//read it in and store it in a variable
		System.out.print("Please enter a seed:  ");
		int seed = kb.nextInt();

		//create random number generator
		//pass the seed to its constructor when you create it
		Random numGenerator = new Random(seed);

/*		//lets create 20 random numbers between 0-8
		//lets print them as they are created
		for (int i=0; i<20; i++)
			System.out.println(numGenerator.nextInt(9));   //random int between 0-8 (including both)
*/

		//create a new array of ints - make it size 6
		int[ ] myArray = new int[6];

		//traverse the array, setting each element to a random
		//number in the range of 0-10 (have to call one of the
		//random number generators methods)
		//print it as we generate them
		for (int i=0; i<myArray.length; i++)    //myArray.length is 6 here
		{
			myArray[i] = numGenerator.nextInt(11);  //gives 0-10
			System.out.println(myArray[i]);
		}

		//traverse the array again, adding up all the elements
		//print the total
		int total = 0;
		for (int i=0; i<myArray.length; i++)
			total = total + myArray[i];

		System.out.println("Total is:  " + total);

		//find the square root of the total and print it
		System.out.println("Square root of total is:  " + Math.sqrt(total));




	}
}
