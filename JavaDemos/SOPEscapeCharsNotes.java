// Notes/Demos for System.out.println and special escape characters
// When you compile a file called SOPEscapeCharsNotes.java,
//    it will create a file called SOPEscapeCharsNotes.class (which is what runs)
// Remember, that you cannot write to the s: drive so you cannot compile programs
// that are on the s: drive because you cannot create that .class file.

public class SOPEscapeCharsNotes
{
	public static void main(String[ ] args)
	{
		//System.out.println will print a String to the output screen and
		//then output a NEWLINE character to skip to the next line
		System.out.print("Hello World");    //note no newline
		System.out.println("My name is Dwyane Johnson");
		System.out.println("I am known as The Rock");

		//System.out.print will print to the screen, but no NEWLINE char
		//It is often used to prompt for input on the same line
		//take a look at the above statements now...
		//  System.out.print("Please enter your name:  ");

		//You can use it to output different "types", too
		//Java will automatically convert them to a String and then print
		System.out.println(234);      //Java automatically converts it to "234" then prints
		System.out.println(25.7);		//Java automatically converts it to "25.7" then prints

		//If you want to output more than one thing, use a + sign
		//Java will interpret it as "concatenation" if there is a String on either side
		//(otherwise, Java interprets it as addition)
		System.out.println("My name is:  " + "Dwayne");
		System.out.println("My age is:  " + 40);
		System.out.println("On my next birthday, I will be:  " + 40 + 1);

		//There are special characters that are often used but are not on the keyboard
		//They are preceded by a backslash
		//		'\n' is a newline    (could be "\nHello" in a String for example)
		System.out.println("\n\n\nSkip 3 lines an\nd prin\n\nt this...");
		//		'\t' is a tab (also could just be in a String like above)
		System.out.println("1\tprint number than tab once");
		//		'\"' is a real double quote (instead of just closing a String)
		System.out.println("I am known as \"The Rock\"");
		//		'\\' is a real backslash (instead of indicating a a special "escape" character
		System.out.println("My address is: \\gccaz\\My Documents");


		// FInally, try making some mistakes ("syntax errors") on purpose to see what the
		// error message is.   Try
		//		leaving out a semicolon
		//		leaving out a } at the end
		//		putting in an extra } at the end
		//		spelling a keyword wrong (static, void, class, public, etc)
		//		changing the class name so it does not match the file name

	}
}

