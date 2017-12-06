//This demo shows how to USE a class in your program.
//In this case, it is a built-in class called String.
//You can go to the api's at java.sun.com and look up String to see all the possible methods

public class StringOOPDemo
{
	public static void main(String[ ] args)
	{
		//In order to USE a class, you
		//   1.   Create a new instance of the class
		//				Note what each part means:
		//					--		the class is String.   We are declaring a variable called myString
		//							whose type is String.
		//					--		We are also creating a new String (with the "new" statement) and storing it
		//							in the variable called myString.
		//					--		We are also "passing" in the initial value it should have ("the quick brown...")
		String myString = new String("the quick brown fox jumped over the lazy red dogs");
		System.out.println(myString);


		//   2.   Tell it to do things (call its methods)
		//				Note the syntax:
		//					--		the name of the variable, then a dot, then the name of the method
		//					--		you have to have () after the name of the method.
		//					--		sometimes you pass things to it inside the ()
		//					--		sometimes the method will evaluate to something ( like .length() )
		int len = myString.length();
		System.out.println("The length is: " + len);

		System.out.println("Does it end with \"dogs\"?  " + myString.endsWith("dogs"));

		myString.replaceAll("dogs", "cats");   //what it will look like with this replacement
		myString = myString.replaceAll("dogs", "cats");   //reset myString to be that...

		System.out.println("The index of the first x is: " + myString.indexOf('x'));

		System.out.println("our phrase shouted out is: " + myString.toUpperCase());
		System.out.println(myString);
	}
}
