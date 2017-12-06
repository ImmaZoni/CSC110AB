/*
This program was made by justin hill on 9/18/2017,
its intentions were to analyze a integer and give information based on the number entered.
*/
import java.util.*;

public  class AnalyzeInts
{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	int userNumber;

	System.out.print("Please enter an integer: ");
	userNumber = kb.nextInt();

	System.out.println("");

	if(userNumber < 0){
		System.out.println(userNumber + " is negative");
	}

	if(userNumber%7==0){
		System.out.println(userNumber + " is divisible by 7");
	}

	if(userNumber%2==0){
		System.out.println(userNumber + " is even");
	} else {
		System.out.println(userNumber + " is odd");
	}
	if(userNumber >= 13 && userNumber < 20){
		System.out.println(userNumber + " is between 13 (inclusive) and 20 (exclusive)");
		System.out.println(userNumber + " is in the teens");
	}

	if(userNumber >= 10 || userNumber <= -10){
		System.out.println(userNumber + " has at least 2 digits");
	}



/*
BETTER WAY TO FIND DIGITS THAN WHAT YOU ASKED FOR
        int digits = 0

        while(userNumber != 0)
        {
            num /= 10;
            ++digits;
        }
*/
}
}
