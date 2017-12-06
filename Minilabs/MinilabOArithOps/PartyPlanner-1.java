import java.util.*;
import java.text.*;//Dependincy for the decimal formatter

public class PartyPlanner
{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);

	//User Information Collection
	System.out.print("What is the name of the person having the party?: ");
	String name = kb.nextLine();
	System.out.print("\nHow old is " + name + " now?: ");
	int ageNow = kb.nextInt();
	System.out.print("\nHow many guests are invited?: ");
	int guests = kb.nextInt();
	System.out.print("\nHow many balloons are ordered?: ");
	int balloons = kb.nextInt();
	System.out.print("\nHow many brownies are ordered?: ");
	int brownieAmount = kb.nextInt();
	System.out.print("\nHow much is each brownie?: ");
	double brownieCost = kb.nextDouble();

	//Extra Variable Definition and User Calculations
	int ageNew = ageNow + 1;
	double totalBrownieCost = brownieAmount * brownieCost;
	double browniesPerGuest = brownieAmount / guests;
	int balloonsPerGuest = balloons / guests;
	int balloonsLeftOver = balloons % guests;

	/*
		Decimal Formatter, an ineresting trick i found online to limit
	the amount of decimals printed for a double, i figured this would
	make sense due to the fact that in totalBrownieCost we are talking
	about money, which only two decimal points are relvent

	import.java.text.DecimalFormat (or *)
	*/

 	DecimalFormat brownieFormat = new DecimalFormat("$##.00");

	//Final User Output

	System.out.println("\n###########################################################");
	System.out.println("\tThe party is for " + name);
	System.out.println("\t" + name + " will turn " + ageNew);
	System.out.println("\t" + name + " is now " + ageNow);
	System.out.println("\tThe total cost of the " + brownieAmount + " brownies is: " + brownieFormat.format(totalBrownieCost));
	System.out.println("\tThe number of brownies per guest is: " + browniesPerGuest);
	System.out.println("\tThe number of balloons per guest is: " + balloonsPerGuest);
	System.out.println("\tNumber of balloons left over is: " + balloonsLeftOver);
	System.out.println( "###########################################################");
	}

}
