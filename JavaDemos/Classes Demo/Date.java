public class Date
{
	private String month;
	private int day;
	private int year;

	/*CONSTRUCTORS
	1.the name of tbe constructor has to be the same as the name of the calss
	2. construcots have no return ypee
	3. if a class does not have any consntructors, Java provides and (automatic)
	 	"default constructor" (no arguements) that initializes the data (int get 0, doubles get 0.0, etc)

*/
//default constructor
public Date()
{
	this.month = "January";
	this.day = 1;
	this.year = 1970;
}




//parameterized constructor
	public Date(String userMonth, int userDay, int userYear)
	{
		this.month = userMonth;
		this.day = userDay;
		this.year = userYear;
	}


	public String toString()
	{
		return month + "/" + day + "/" + year;
	}

	//Setter Meathod

	public void setMonth(String userMonth)
	{
		this.month = userMonth;
	}

	public void setDay(int userDay)
	{
		this.day = userDay;
	}


	//Getter Meathod
	public String getMonth()
	{
		return this.month;
	}

	public int getDay()
	{
		return this.day;
	}

	public boolean isLeapDay()
	{
		if (this.month.equals("February ") && this.day == 29)
			return true;
		else
			return false;

	}

}