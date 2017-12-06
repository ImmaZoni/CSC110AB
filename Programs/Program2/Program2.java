/*
This program was made by Justin Hill from 9-9:50 csc110ab on 9/24/2017
its intentions are to tell the user what the day before the
day entered is.
*/
import java.util.*;

public class Program2
{
	public static void main(String[] args)
	{

	Scanner kb = new Scanner(System.in);

//Variable Initiation
	int month;
	int day;
	int year;
	boolean isLeapYear = false;

//User Input
	System.out.print("Please enter month, day, year (as integers, separated by spaces): ");
		month=kb.nextInt();
		day=kb.nextInt();
		year=kb.nextInt();

//Leap Year Detection
	if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
		isLeapYear = true;
	} else {
		isLeapYear = false;
	}

//Last Day of the Month Switch Statement
	int isLastDay = 99;
	int anotherMonth = month;
	--anotherMonth;
	switch (anotherMonth) {
		case 1:
			isLastDay = 31;
			break;
		case 2: //More if statements for leap year integration
			if(isLeapYear == true){
				isLastDay = 29;
			}else if(isLeapYear == false){
				isLastDay = 28;
			}
			break;
		case 3:
			isLastDay = 31;
			break;
		case 4:
			isLastDay = 30;
			break;
		case 5:
			isLastDay = 31;
			break;
		case 6:
			isLastDay = 30;
			break;
		case 7:
			isLastDay = 31;
			break;
		case 8:
			isLastDay = 	31;
			break;
		case 9:
			isLastDay = 30;
			break;
		case 10:
			isLastDay = 31;
			break;
		case 11:
			isLastDay = 30;
			break;
		case 12:
			isLastDay = 31;
			break;
		}

//Calculations of the Day Before
		int yesterMonth = month;
		int yesterDay = day;
		int yesterYear = year;

		if((day==1) && (month != 1)) {
			yesterMonth = --month;
			yesterYear = year;
			yesterDay = isLastDay;
		} else if ((day==1) && (month ==1)){
			yesterMonth = 12;
			yesterYear = --year;
			isLastDay = 31;
			yesterDay = isLastDay;
		} else {
			yesterDay = --day;
		}

//Final Output
		System.out.println("\n" + yesterMonth + "/" + yesterDay + "/" + yesterYear);

	}
}