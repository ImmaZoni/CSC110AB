/*
This program was coded on 9/7/17 with the intentions
of storing hours per week  for 4 weeks and the recorded
number of sales calls, we then print various amounts
of information about the user.
*/
import java.util.*;

public class Program1
{
	public static void main(String[] args)
	{

//Scanner to allow for keyboard input
	Scanner kb = new Scanner(System.in);

//Constant variables, allows for no hard coding within the program
	final int WORKWEEK = 40; //length of full time work week
	final int WORKDAY = 8; //length of full day
	final double VACRATE = .05; //vacation hours earned per hour worked
	final int WEEKSRECORDED =  4; //number of weeks recorded, make sure to change if adding more weeks to input.

//Variable Decaliration
	String name;
	int leftover;
	int firstWeek;
	int secondWeek;
	int thirdWeek;
	int fourthWeek;
	int salesCalls;
	int totalHours;
	int weeksWorked;
	int daysWorked;
	int hoursWorked;
	double avgHours;
	double vacHours;
	double avgSalesCalls;

//Gathering of user data
	System.out.print("Please enter name: ");
		name = kb.nextLine();
	System.out.print("\nPlease enter the first week's hours worked(as an integer): ");
		firstWeek = kb.nextInt();
	System.out.print("Please enter the second week's hours worked(as an integer): ");
		secondWeek = kb.nextInt();
	System.out.print("Please enter the third week's hours worked(as an integer): ");
		thirdWeek = kb.nextInt();
	System.out.print("Please enter the fourth week's hours worked(as an integer): ");
		fourthWeek = kb.nextInt();
	System.out.print("\nPlease enter the sales calls recorded(as an integer): ");
		salesCalls = kb.nextInt();

//Arithmatic Sequences
	totalHours = firstWeek + secondWeek + thirdWeek + fourthWeek;
	avgHours = (double)totalHours/WEEKSRECORDED;
	weeksWorked = totalHours/WORKWEEK;
	leftover = totalHours%WORKWEEK;
	daysWorked = leftover/WORKDAY;
	hoursWorked = leftover%WORKDAY;
	vacHours = VACRATE * totalHours;
	avgSalesCalls = (double)salesCalls / (double)totalHours;

//FINAL USER OUTPUT
	System.out.println("\t" + name);
	System.out.println("\t\tTotal hours worked: " + totalHours);
	System.out.println("\t\tAverage hours worked per week: " + avgHours);
	System.out.println("\t\tVacation hours earned: " + vacHours);
	System.out.println("\t\tFull time equivalent: " );

	//if statements to support plural
		if (weeksWorked == 1) {
			System.out.println("\t\t\t" + weeksWorked + " week");
		} else {
			System.out.println("\t\t\t" + weeksWorked + " weeks");
		}

		if(daysWorked == 1) {
			System.out.println("\t\t\t" + daysWorked + " day");
		} else {
			System.out.println("\t\t\t" + daysWorked + " days");
		}

		if(hoursWorked == 1) {
			System.out.println("\t\t\t" + hoursWorked + " hour");
		} else {
			System.out.println("\t\t\t" + hoursWorked + " hours");
		}

	//if statement to stop division on zero
		if(salesCalls == 0){
			System.out.println();
		} else {
			System.out.println("\t\tAverage sales calls per hour: " + avgSalesCalls);
		}
}
}
