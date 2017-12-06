public class StringDemo
{
	public static void main(String[ ] arrrrrrrrrgs)
	{
		//create a new instance of a String
		String myString = new String("It is Tuesday");

		System.out.println(myString);
		System.out.println("the length is:  " + myString.length());
		System.out.println("the char at position 7 is:  " + myString.charAt(7));
		System.out.println("the index of the first d is:  " + myString.indexOf('d'));
		boolean answer = myString.contains("Tues");
		System.out.println("does it contain \"Tues\"?  " + answer);

	}
}
