import java.util.*;

public class ClassesDemo
{
	public static void main(String[] args)
	{
		//New Instance of a Scanner
		Scanner kb = new Scanner(System.in);

		//ask the user to enter a seed for our random numbers.
		//read it in and store it in a variable
		System.out.print("Enter a seed: ");
		int seed = kb.nextInt();

		//create random number generator
		//pass the seed to its constructor when you create it
		Random numGen = new Random(seed);

		/*use a loop to generate and print 20 random numbers between 0-8
		for(int i=0; i<20; i++)
			System.out.println(numGen.nextInt(9));
*/

		//Create a new array of ints size 20;
		int[] myInts = new int[20];

		for (int i=0; i<myInts.length; i++) {
			System.out.print(myInts[i] + " "); }

			System.out.println();
		//traverse the whole array
		for(int i = 0; i<myInts.length; i++){
			myInts[i] = numGen.nextInt(11);
			System.out.println(myInts[i]);
		}
	}
}
