// This demo will show:
//		1.  how to read from a file (using a while loop to read and process every line)
//		2.  how to write to a file

import java.io.*;
import java.util.*;

public class FileIODemoNotes
{
	public static void main(String[ ] args) throws Throwable    // <=== NOTE...see below
	{
		//====================================================
		// PART 1:	Reading a file:
		//====================================================

		String filename = "lineup.txt";    // <===	for fully qualified pathnames, you must have
															//			"C:\\My Documents\\Java stuff\\Program5.java"
															//			( note the \\ which will mean a single \ )

		Scanner input = new Scanner(new FileInputStream(filename));
															// Here a new instance of a Scanner is created.   But
															// instead of connecting to the keyboard (System.in),
															// it connects to a new FileInputStream which in turn
															// is created so it connects with the file.

		while (input.hasNextLine())   	// <===	we don't know how many lines the file has so
														//			keep asking it if it has another line
		{
			String inputLine = input.nextLine();  	// <===	read in the whole line
																			//			since it is a Scanner, you could also
																			//			call next(), nextInt(), nextDouble()

			if (inputLine.length() > 0)						// <===	note that there might be empty lines
				System.out.println("process " + inputLine + " somehow...");
		}

		input.close();		// <=== tell it to close itself

		System.out.println("Part1 (reading a file) ended successfully");

		// NOTE!!!!	When opening a file for input (above) or creating a file for output (below), some
		//					runtime errors might occur (FileNotFoundException or FileIOException).  Java
		//					considers these so important that it makes you handle them by either a try-catch
		//					block or by putting    throws <exceptionnames> after the method declaration (and
		//					the declaration of every method that might call it).

		//					These are called "CHECKED EXCEPTIONS."   If you don't handle them, you will get a
		//					compile-time error that says "Must be caught or declared to be thrown"

		//					If you put      throws Throwable     after the method declaration, it will handle every
		//					kind of exception (since they are subclasses of Throwable).


		//====================================================
		// PART 2:	Writing to a file:
		//====================================================

		String filename2 = "research.txt";		// <=== same notes as above.   Use \\ if you want a \ in the String

		PrintWriter outputStream = new PrintWriter(new FileOutputStream(filename2, true));
															// Create a new instance of a PrintWriter.   As it is created,
															// connect it to a new FileOutputStream, which is in turn
															// connected to the file.  If you put    true   afterwards,
															// it will "append" (add on) to the file.   If it is false or not there
															// at all, it will start over and overwrite the whole file.

		outputStream.println("'SUP");	// <=== use .println or .print just like with System.out
		outputStream.print("Hello");	// <=== use .println or .print just like with System.out
		outputStream.println("goodbye...");	// <=== use .println or .print just like with System.out

		outputStream.close();   // <=== tell it to close itself

		System.out.println("Part2 (writing to a file) ended successfully");

	}
}
