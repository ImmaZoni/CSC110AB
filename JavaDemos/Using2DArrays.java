public class Using2DArrays
{
	public static void main(String[ ] args)
	{
		//create a 2D array of ints - 4 rows, 3 columns
		int[ ][ ] graphPaper = new int[4][3];

		//every element will be initialized to 0
		//but...lets fill some in
		graphPaper[2][1] = 6;
		graphPaper[0][2] = -99;
		graphPaper[1][1] = 205;

		//print it
		for (int row=0; row<graphPaper.length; row++)   //go through each row
		{
			System.out.println();   //go to next line for each row
			for (int col=0; col<graphPaper[row].length; col++)   //go through each col for that row
				System.out.print(graphPaper[row][col] + "\t");
		}

		//create a new "ragged array" (2D array where each row has a different size)
		//remember - a 2 dimensional array is an "array of arrays"
		int[ ][ ] ragged = {  { 1, 3}        ,     {2}        ,     {2, 4, 66}        };

		//print it
		System.out.println("\n\n\n");
		for (int row=0; row<ragged.length; row++)   //go through each row
		{
			System.out.println();   //go to next line for each row
			for (int col=0; col<ragged[row].length; col++)   //go through each col for that row
				System.out.print(ragged[row][col] + "\t");
		}



	}
}
