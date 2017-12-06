//This class represents a Student

public class Student extends Human
{
	//data (some is inherited)
	protected int meid;
	protected double debt;
	protected String major;
	protected double gpa;

	//constructor(s)
	public Student()
	{
		//These first 4 statements were copied from Human (its parent, or superclass)
		//name = "John Doe";
		//birthday = new Date();
		//hairColor = new Color(0, 0, 0);
		//gender = 'm';

		super();    //now do what parent's default constructor would do
		meid = 999;
		major = "Psychology";
		debt = 4500.00;
		gpa = 0.0;

	}

/*	public Student(String studName, Date studBDay)
	{
		//super(studName, studBDay);
		super();     //set all to be same as parent's default constructor
		this.name = studName;    //then change a few
		this.birthday = studBDay;
	}
*/
	//methods - some are inherited

	//getWeekendPlans - returns the plans for the weekend
/*	public String getWeekendPlans()
	{
		return ("study Java!");
	}
*/
	//toString - returns it representation as a String
/*	public String toString()
	{
		return "I am a Student with name: " + this.name +
		           "\nbirthday: " + this.birthday +
		           "\nhaircolor: " + this.hairColor +
		           "\ngender: " + this.gender +
		           "\nid: " + this.meid +
		           "\nmajor: " + this.major +
		           "\ngpa: " + this.gpa +
		           "\nand unfortunately a debt of " + this.debt;

	 } */
 }


