//This class represents a Human

import java.util.*;
import java.awt.*;

public class Human
{
	//---------------data
	protected String name;
	protected java.util.Date birthday;
	protected Color hairColor;
	protected char gender;

	//-----------------constructor(s)
	public Human()
	{
		name = "John Doe";
		birthday = new java.util.Date();
		hairColor = new Color(0, 0, 0);
		gender = 'm';
	}

	public Human(String theName, Date theBirthday,
	                         Color theColor, char theGender)
	{
		this.name = theName;
		this.birthday = theBirthday;
		this.hairColor = theColor;
		this.gender = theGender;
	}

	public Human(String theName, Date theBirthday)
	{
		//this.name = theName;
		//this.birthday = theBirthday;
		//this.hairColor = Color.PINK;
		//this.gender = 'f';
		this(theName, theBirthday, Color.PINK, 'f');
	}



	//---------------------methods

	//changeName - changes the name to whatever is received
	public void changeName(String newName)
	{
		this.name = newName;
	}

	//getWeekendPlans - returns the plans for the weekend
	public String getWeekendPlans()
	{
		return ("sleep late!");
	}

	//toString - returns its representation as a String
/*	public String toString()
	{
		return "I am a Human with name: " + this.name +
		           "\nbirthday: " + this.birthday +
		           "\nhaircolor: " + this.hairColor +
		           "\ngender: " + this.gender;
	 }
*/
}

