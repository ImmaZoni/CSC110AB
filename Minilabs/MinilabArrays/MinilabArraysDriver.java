//Driver for MinilabArrays - note how it works

public class MinilabArraysDriver
{
	public static void main(String[ ] args)
	{
		//create a 1d array of ints
		int[ ] array1d = { 8, 8, 7, 5, 3 };

		//call mean1d Method to find the mean (note the static call...)
		double theMean = MinilabArrays.mean1d(array1d);

		//print the original array and the mean
		System.out.print("The mean of: { ");
		for (int i=0; i<array1d.length; i++)
		{
			if (i != 0)
				System.out.print("   ");     //print first for separation (except before first element)
			System.out.print(array1d[i]);
		}
		System.out.print(" }   is:  " + theMean);

		//------------------------------------------------------------
		System.out.println("\n\n");

		//create a 2d array of doubles
		double[ ][ ] array2d =	{
													{ 3.4,  5.1,  8.0},
													{ 5.23,  8.2 },
													{ 10.7 },
													{ 2.9 }
												};

		//call sum2d to get the sum
		double total = MinilabArrays.sum2d(array2d);

		//print the 2D array
		for (int row=0; row<array2d.length; row++)
		{
			System.out.println();
			for (int col=0; col<array2d[row].length; col++)
				System.out.print(array2d[row][col] + "\t");
		}

		//print the result
		System.out.println("\n\nTotal of 2d array is: " + total);

		System.out.println("\n\n");
	}
}
