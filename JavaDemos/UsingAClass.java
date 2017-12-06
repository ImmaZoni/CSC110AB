public class UsingAClass
{
	public static void main(String[ ] args)
	{
		//create an instance of a String
		String myString = new String("It is Tuesday");
		//( shortcut for Strings: String myString = "Tuesday"; )

		//now that a String has been created, we can tell it to do things.
		//we will call its methods (operations it can do to itself)
		int length = myString.length();
		System.out.println("The length is  " + length);
		System.out.println(myString.length());

		System.out.println(myString.charAt(6));   //char at position 6 (positions start at 0)
		System.out.println(myString.contains("Tues"));
	}
}
