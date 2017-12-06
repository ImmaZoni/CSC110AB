/*	In this Minilab, the program asks the user to enter a String and stores it in str.
	You should read the existing code; the comments will tell you how you are
	to work with str by using the methods that are built into the String class.
	So you have to figure out which methods to use and how to use them.
	For each part, you should fill in code where the lines say // <====== YOUR CODE HERE
	Look at PART0 to see an example.

	Look closely at the documentation for the String class, especially the methods.
    The documentation can be found at java.sun.com (then click APIs on the left,
    then choose which Java version to use).

	PLEASE DO NOT CHANGE LINES THAT HAVE System.out.println IN THEM !!!
	Instead, look for the lines that say:
														// <====== YOUR CODE HERE

	and put in one or more statements in those lines use String methods to do what the comment says.

	You might use the following String methods (see java.sun.com APIs for documentation):
			contains
			substring (2 versions)
			replace
			equals
			isEmpty
			charAt
			indexOf
			length
			startsWith
			endsWith
			toUpperCase
			equalsIgnoreCase
			get

	You can test your code with the following inputs - see if they work (refer to documentation).
	Please make sure you understand the results:
			Computer Science
			Science
			SCiEnCE
			Glendale
			(an empty String; just hit ENTER)
*/

import java.util.*;

public class AnalyzeStrings
{
	public static void main(String[ ] args)
	{
		//declare a new instance of a Scanner
		Scanner kb = new Scanner(System.in);

		//declare the String that will hold the input
		String str;

		//declare answer variables (with fake initial values) that you will use to hold what is returned
		//from the methods
		int intAnswer = -99999;
		char charAnswer = '$';
		String stringAnswer = "nothing";
		boolean booleanAnswer = false;

		//write statement(s) below to prompt the user to enter a String - store it in the str variable
		System.out.print("Please enter a String to be analyzed:  ");
		str = kb.nextLine();

		System.out.println("\nThe input String is: " + str);

		//PART0: write statement(s) below to tell str to return its length;
		//store result in intAnswer
		intAnswer = str.length();      // <====== YOUR CODE WILL GO HERE LIKE THIS (EXAMPLE)
		System.out.println("\nPART0: Its length is: " + intAnswer);

		//PART1: write statement(s) below to ask str if it is empty
		//store result in booleanAnswer
		 booleanAnswer = str.isEmpty();				// <====== YOUR CODE HERE
		System.out.println("\nPART1: is it empty? " + booleanAnswer);

		//PART2: write statement(s) below to ask str for its character at position 4 (to a computer)
		//store result in charAnswer
		try     // "try" to do this part. If there is an exception, it will try to "catch" it so it won't crash
		{
			charAnswer = str.charAt(4);						// <====== YOUR CODE HERE
			System.out.println("\nPART2: the char at position 4 is: " + charAnswer);
		}
		catch(StringIndexOutOfBoundsException theException)
		{
			System.out.println(theException);
		}

		//PART3: write statement(s) below to ask str where the first 'a' occurs (to a computer)
		//store result in intAnswer
		intAnswer = str.indexOf(97);						// <====== YOUR CODE HERE
		System.out.println("\nPART3: the index of the first 'a' is: " + intAnswer);

		//PART4: write statement(s) below to ask str whether or not it contains "Computer"
		//store result in booleanAnswer
		CharSequence comp1 = "Computer";
		booleanAnswer = str.contains(comp1);											// <====== YOUR CODE HERE
		System.out.println("\nPART4: Does it contain \"Computer\"? " + booleanAnswer);

		//PART5: write statement(s) below to check if str == "Science".   Use == instead of a method
		//just to see the result.  Store result in booleanAnswer
		if(str=="Science"){
			booleanAnswer = true;
		} else {
			booleanAnswer = false;
		}
		System.out.println("\nPART5: Does it .equals \"Science\"? " + booleanAnswer);

		//PART6: write statement(s) below to ask str whether or not it equals \"Science\"
		//store result in booleanAnswer
		String tstString = "Science";
		booleanAnswer = str.equals(tstString);				// <====== YOUR CODE HERE
		System.out.println("\nPART6: Does it .equals \"Science\"? " + booleanAnswer);

		//PART7: write statement(s) below to ask str whether or not it equals \"Science\" (ignore case)
		//store result in booleanAnswer
		booleanAnswer = str.equalsIgnoreCase(tstString);										// <====== YOUR CODE HERE
		System.out.println("\nPART7: Does it .equals \"Science\" if we ignore case? " + booleanAnswer);

		//PART8: write statement(s) below to ask str if it starts with "Computer"?
		//store result in booleanAnswer
		String comp = "Computer";
		booleanAnswer = str.startsWith(comp);											// <====== YOUR CODE HERE
		System.out.println("\nPART8: Does it start with \"Computer\" ? " + booleanAnswer);

		//PART9: write statements(s) below to ask str if it ends with "Science"?
		//store result in booleanAnswer
		booleanAnswer = str.endsWith(tstString);											// <====== YOUR CODE HERE
		System.out.println("\nPART9: Does it end with \"Science\" ? " + booleanAnswer);

		//PART10: write statement(s) below to ask str for its substring from position 3 to the end
		//store result in stringAnswer
		stringAnswer = str.substring(3);			// <====== YOUR CODE HERE
		System.out.println("\nPART10: Its substring from position 3 to the end is: " + stringAnswer);

		//PART11: write statement(s) below to ask str for its substring from position 3 to 6 (to a computer)
		//(BE VERY CAREFUL - read the documentation carefully)
		//store result in stringAnswer
		stringAnswer = str.substring(2, 6);											// <====== YOUR CODE HERE
		System.out.println("\nPART11: Its substring from position 3 to 6 (to a computer, should have 4 chars) is: " + stringAnswer);

		//PART12: reset stringAnswer to be "".  Then use a for loop to traverse str, getting each character one at a time.
		//If the index is even (its char #0, char #2, char #4, char #6 etc.), then concatenate the char at that position to stringAnswer.
		//              for example:    if str was "computers" then your stringAnswer should be "cmues" (char #0,2,4,6,8)
		//After the loop is finished, stringAnswer should have every other character from str.

			stringAnswer = "";
			char[] array = new char[str.length()];
			str.getChars(0, str.length(), array, 0);
			for(int i=0; i<str.length(); ++i, i++){
				if(i%2==0){
					stringAnswer =stringAnswer + array[i];
					}
			}


													// <====== YOUR CODE HERE
		System.out.println("\nPART12: Every second character (starting at character #0) is:  " + stringAnswer);

		//PART13:  write statement(s) below to ask str what it LOOKS like as all upper case.
		//store result in stringAnswer
		stringAnswer = str.toUpperCase();											// <====== YOUR CODE HERE
		System.out.println("\nPART13: The String as all upper case would LOOK like: " + stringAnswer);
		System.out.println("        The value of str is:  " + str);

		//PART14: write statement(s) below to tell str to change all e's to x's.
		//store the result in str (which will reset its value).
		//(Note the difference between this part and the previous one...)


					str = str.toLowerCase();
					str = str.replace("e", "x");
		// <====== YOUR CODE HERE
		System.out.println("\nPART14: The String after being changed (all e's changed x's) is: " + str);
	}
}
