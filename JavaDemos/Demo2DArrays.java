public class Demo2DArrays
{
	public static void main(String[ ] args)
	{
		//create a new 2D array to hold ints (4 rows, 3 columns)
		int[ ][ ] my2DArray = new int[4][3];

		//lets put in some values
		my2DArray[0][0] = 4;
		my2DArray[1][2] = 6;
		my2DArray[2][1] = 3;
		my2DArray[3][0] = 2;
		my2DArray[3][2] = 7;

		//print the array (remember, it is an "array of arrays")
		for (int row=0; row<my2DArray.length; row++)       //go through each row
		{
			System.out.println();    //start a new line
			for (int col=0; col<my2DArray[row].length; col++) //go through each col in that row
				System.out.print(my2DArray[row][col] + "\t");
		}

		//print the array (remember, it is an "array of arrays")
		int total = 0;
		for (int row=0; row<my2DArray.length; row++)       //go through each row
		{
			for (int col=0; col<my2DArray[row].length; col++) //go through each col in that row
				total = total + my2DArray[row][col];
		}

		System.out.println("The total is:  " + total);


		System.out.println("\n\n");     //for separation

		//--------------------------------

		//create a new "ragged array"
		int[ ][ ] ragged = {    {2, 3}           ,     {1, 4, 7, 8}                ,     {6}      };

		//print the array (remember, it is an "array of arrays")
		for (int row=0; row<ragged.length; row++)       //go through each row
		{
			System.out.println();    //start a new line
			for (int col=0; col<ragged[row].length; col++) //go through each col in that row
				System.out.print(ragged[row][col] + "\t");
		}

		System.out.println("\n");    //for separation

	}
}








