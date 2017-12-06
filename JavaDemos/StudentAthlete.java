//This class represents a StudentAthlete

public class StudentAthlete extends Student
{
	//--------------data - lots inherited, also have
	protected String sport;
	protected String position;

	//----------------constructors
	public StudentAthlete()
	{
		super();    //initialize everything like Student would do
		this.sport = "Badminton";     //except for this
		this.position = "server?";      //and this
	}

	//----------------methods

	//getWeekendPlans - returns the plans for the weekend
/*	public String getWeekendPlans()
	{
		return ("practice!");
	}
*/
	//toString - returns its representation as a String
	public String toString()
	{
		return "I am a StudentAthlete with name: " + this.name +
		           "\nbirthday: " + this.birthday +
		           "\nhaircolor: " + this.hairColor +
		           "\ngender: " + this.gender +
		           "\nid: " + this.meid +
		           "\nmajor: " + this.major +
		           "\ngpa: " + this.gpa +
		           "\nsport: " + this.sport +
		           "\nposition: " + this.position;
	}
 }
