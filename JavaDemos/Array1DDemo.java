//This demo will show one and two dimenstional arrays and also how
//"ragged arrays" can be created.

public class Array1DDemo
{
	public static void main(String[ ] args)
	{
		//create a new instance of a random number generator
		java.util.Random gen = new java.util.Random(12345);     //or could import...

		//suppose you wanted to store test scores for everyone in our class
		//you could create 16 variables to hold them
		int score0;
		int score1;
		int score2;
		//etc....
		int score15;

		//the better way to do it is to create an array of scores.   Arrays are
		//a single variable that can hold lots of things of the same type
		//they will be thought of as "the 0th one", "the 1st one", "the 2nd one"
		int[ ] scores = new int[6];

		//you can set the elements of the array individually
		scores[0] = 92;
		scores[1] = 91;
		scores[2] = 90;
		scores[3] = 89;
		scores[4] = 82;

		//you can output them individually
		System.out.println("the 0th element is:  " + scores[0]);
		System.out.println("the sum of the first 2 elements is:  " + (scores[0]+scores[1]));


		//you can "traverse" the array (visit every element) using a for loop
		for (int i=0; i<scores.length; i++)      //<-- note  i<scores.length here is 23
			System.out.print(scores[i] + "  ");
		System.out.println();

		//you can "traverse" the array (visit every element) using a for loop
		int total = 0;
		for (int i=0; i<scores.length; i++)      //<-- note  i<scores.length here is 23
			total = total + scores[i];
		System.out.println("The total for all elements is:  " + total);

/*
		//you can access each element individually to print it or change it, etc
		scores[4] = 28;
		scores[5] = -7;
		scores[6]++;
		scores[11] = 300;

		//you can "traverse" the array (visit every element) using a for loop
		for (int i=0; i<scores.length; i++)      //<-- note  i<scores.length
			System.out.print(scores[i] + "  ");
		System.out.println();

		//reset each element to a random number from 0-100
		for (int i=0; i<scores.length; i++)      //<-- note  i<scores.length
			scores[i] = gen.nextInt(101);    //will be 0-100

		//you can "traverse" the array (visit every element) using a for loop
		int total = 0;
		for (int i=0; i<scores.length; i++)      //<-- note  i<scores.length
		{
			total = total + scores[i];
			System.out.print(scores[i] + "  ");
		}
		System.out.println("\n\nThe total is: " + total);

		//-------------------------------
		String name = "Joe";    //shortcut for initializing a String
		//int[ ] myArray = new int[6];
		double[ ] myArray = { 3.2, 1.99, 6.25, 8, -1.2 };  //shortcut for initializing an array

		//print them
		for (int i=0; i<myArray.length; i++)
			System.out.println("myArray[" + i + "] is  " + myArray[i]);
*/
	}
}











