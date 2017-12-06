//This program will calculate a student's grade, when an average is input

/* you are to
       1. fix the syntax errors so that it will compile
              - any questions about requirements - ASK THE CUSTOMER
       2. fix the logic errors so that it runs CORRECTLY
              - what should your test cases be?
 */

import java.util.*;

public class Grades
{
	public static void main(String[ ] args)
	{
		//declare a Scanner
		Scanner kb = new Scanner(System.in);

		//ask the user to input their average
		System.out.print("Please enter an average (for a class):  ");
		double avg = kb.nextDouble();

		//change it to a grade
		char grade;
		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)    //if you get to here, you KNOW avg < 90
			grade = 'B';
		else if (avg >= 70)    //so here you don't need the  avg < 80
			grade = 'C';
		else if (avg < 70 && avg >= 60)
			grade = 'D';
		else if (avg < 60 && avg >= 0)
			grade = 'F';
		else      //all other cases - often to detect error cases
			grade = '?';

		//print it
		System.out.println("\nThe grade is:  " + grade);

		//-----------------------------------
		//PART2 - given the grade, generate a comment

		String comment;
		if (grade == 'A' || grade == 'a')
			comment = "Stellar workmanShip!";
		else if (grade == 'B' || grade == 'b')
			comment = "good";
		else if (grade == 'C' || grade == 'c')
			comment = "work harder if you want to be better than average";
		else if (grade == 'D' || grade == 'd')
			comment = "you bring shame upon us";
		else if (grade == 'F'|| grade == 'f')
			comment = "application at MickeyD's";
		else
			comment = "unknown grade";

		System.out.println(comment);

		//--------------------------------------
		//do the same thing with a switch statement
		switch(grade)      //switch depending on grade
		{
			case 'A':
			case 'a':	System.out.println("very excellent!");
							break;      //done - go out of the switch
			case 'B':
			case 'b':	System.out.println("OK");
							break;
			case 'C':
			case 'c':	System.out.println("you are better than average - try harder");
							break;
			case 'D':
			case 'd':	System.out.println("this is bad, no sugar coating it");
							break;
			case 'F':
			case 'f':	System.out.println("see you next semester...");
							break;
			default:	System.out.println("I don't recognize this grade");   //all other cases
		}

		//-------------------------------
		//conditional statement
		//     (part1  ?   part2   :   part3)      means if part1 is true, it evaluates to part2 else evaluates to part3
		//		int x = 4;
		//		(x == 4 ? "hello" : "hi");        this whole statement evaluates to hello

		//        (grade == 'A' ? "you get 5 dollars" : "you get nothing");
		System.out.println(grade == 'A' ? "you get 5 dollars" : "you get nothing");
	}
}
