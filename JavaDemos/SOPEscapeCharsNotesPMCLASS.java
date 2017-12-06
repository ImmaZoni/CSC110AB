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


		//System.out.print will print to the screen, but no NEWLINE char
		//It is often used to prompt for input on the same line
		//take a look at the above statements now...
		//  System.out.print("Please enter your name:  ");

		//You can use it to output different "types", too
		//Java will automatically convert them to a String and then print


		//If you want to output more than one thing, use a + sign
		//Java will interpret it as "concatenation" if there is a String on either side
		//(otherwise, Java interprets it as addition)


		//There are special characters that are often used but are not on the keyboard
		//They are preceded by a backslash
		//		'\n' is a newline    (could be "\nHello" in a String for example)
		//		\'t' is a tab (also could just be in a String like above)
		//		\" is a real double quote (instead of just closing a String)
		//		\\ is a real backslash (instead of indicating a a special "escape" character


		// FInally, try making some mistakes ("syntax errors") on purpose to see what the
		// error message is.   Try
		//		leaving out a semicolon
		//		leaving out a } at the end
		//		putting in an extra } at the end
		//		spelling a keyword wrong (static, void, class, public, etc)
		//		changing the class name so it does not match the file name

	}
}
