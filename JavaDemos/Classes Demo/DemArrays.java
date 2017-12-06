public class DemArrays
{
	public static void main(String[] args)
	{
		int[][] graphPaper = new int[4][3];

		graphPaper[2][1] = 6;
		graphPaper[0][2] = -99;
		graphPaper[1][1] = 205;

		for (int row=0; row<graphPaper.length; row++) {
			System.out.println();
			for (int col=0; col<graphPaper[row].length; col++) {
				System.out.print(graphPaper[row][col] + "\t");

			}
		}


		//ragged array

		int[][] ragged = {{1, 3},{2},{2, 4, 66}};


				for (int row=0; row<ragged.length; row++) {
					System.out.println("\n");
					for (int col=0; col<ragged[row].length; col++) {
				System.out.print(ragged[row][col] + "\t");
					}
				}
	}
}
