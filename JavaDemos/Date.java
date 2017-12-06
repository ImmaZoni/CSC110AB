//this class is a calendar date

public class Date
{
	//-------- data
	private String month;
	private int day;
	private int year;

	//-------- constructors
	//constructors are called at the instant its create
	//they give it their initial values
	//  1. constructors have the same name as the class
	//  2. constructors are defined with NO RETURN TYPE
	//  3. if you don't have ANY constructors, Java will
	//      automatically provide a "default constructor"
	//      (no arguments) that will initialize ints to 0, doubles to 0.0,
	//      etc.    BUT...once you start writing your own
	//      constructors, Java no longer provides the default one.
	//      You have to write your own...

	//default constructor (no arguments)
	public               Date()
	{
		this.month = "January";
		this.day = 1;
		this.year = 1970;
	}

	//parameterized constructor (takes arguments)
	public                Date(String aMonth, int aDay, int aYear)
	{
		this.month = aMonth;
		this.day = aDay;
		this.year = aYear;
	}

	//-------- methds - operations it can do to its own data

	//toString - returns its represention as a String
	public String toString()     //don't need to pass in anything, it returns a String
	{
		return this.month + " " + this.day + ", " + year;    //this.   is  optional
	}

	//a "getter" method (accessor method) will access the data
	//getMonth will get and return the month
	public String getMonth()      //it will get and return a String; don't need to pass anything to it
	{
		return this.month;
	}

	//getDay - returns the day
	public int getDay()
	{
		return this.day;
	}

	//a "setter" method (mutator method) will change the data
	//setMonth will set the month to whatever is received
	public void setMonth(String aMonth)  //receives a new Month, returns nothing
	{
		this.month = aMonth;
	}

	//setDay - sets the day to whatever is received
	public void setDay(int aDay)
	{
		this.day = aDay;
	}

	//isLeapDay - returns true if it is "leap day" (February 29)
	public boolean isLeapDay()
	{
		return (this.month.equals("February") && this.day == 29);
/*		if (this.month.equals("February") && this.day == 29)
			return true;
		else
			return false;
*/
	}




}
