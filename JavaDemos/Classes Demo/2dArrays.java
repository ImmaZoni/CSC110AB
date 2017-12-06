public class 2dArrays
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

	}
}
