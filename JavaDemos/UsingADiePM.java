public class UsingADiePM
{
	public static void main(String[ ] args)
	{
		//  1.  create a new instance of the class
		Die myDye = new Die(17);

		//  2.  tell it to do things (call its methods)
		for (int i=0; i<10; i++)
			System.out.println("it rolled itself and returned a:  " + myDye.roll());

	}
}
