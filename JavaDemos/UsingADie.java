public class UsingADie
{
	public static void main(String[ ] args)
	{
		//  1.  create a new instance of a Die
		Die myDie = new Die(8);

		//  2.  tell it to do things (call its methods)
		for (int i=0; i<15; i++ )    //do this 15 times!
			System.out.println(myDie.roll());     //tell it to roll ITSELF



	}
}
